class raxyy{
 public void playMusic(){
    System.out.println("Play Music..");
 }
 public String getApp(){
    return "pen";
 }
}
public class demo{
    public static void main(String[] args){
        raxyy obj = new raxyy();
        obj.playMusic();
        String str = obj.getApp();
    System.out.println(str);
      }
}