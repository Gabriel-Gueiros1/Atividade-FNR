public class ContadorThread extends Thread{

    String nome;

    public ContadorThread (String nome){
        this.nome = nome;
        start();
    }
    
    public void run(){
        try {
            for(int i = 1; i <=10; i++){
                sleep(500);  
                System.out.println("Thread "+ nome + ":" + i);
            }
        } catch (Exception e) {
            
        }
    }

}
