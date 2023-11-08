import java.util.ArrayList;

public class ThreadSoma extends Thread {
    int posicao;
    int soma = 0;
    private static int[] teste  = new int[]{1,2,3,4,5,6,7,8,9,10};
    private static ArrayList<Integer> ints_soma = new ArrayList<>();

    public ThreadSoma (int posicao){
        this.posicao = posicao;
        start();    
    }
    
    public void run(){
        try {
            int resultado = teste[this.posicao] + teste[this.posicao+1];
            synchronized (ints_soma){
                ints_soma.add(resultado);
                if(ints_soma.size() == 5){
                    for(int i : ints_soma){
                        soma += i;
                    }
                    System.out.println(soma);
                }
            }    
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
