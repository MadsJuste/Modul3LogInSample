    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Juste
 */
public class Build {
    
    private int hight;
    private int width;
    private int length; 
    private int four;
    private int two;
    private int one;
    private int id;
    private int status;
    public Build(int hight, int width, int length){
        this.hight = hight;
        this.width = width;
        this.length = length;
        setBlocks();
    }
    
    public void setBlocks(){
        
        int width1=0;
        int width2=0;
        int width4 = (width - 4)/4;
        int widthModu = (width - 4)%4;
        switch (widthModu) {
            case 0: 
            break;
            case 1: width1 = 1; 
            break;
            case 2: width2 = 1;
            break;
            case 3: width1 = 1; width2 = 1;
            break;
                   
        }
        
        int length1=0;
        int length2=0;
        int length4 = length/4;
        int lengthModu = length%4;
        switch (lengthModu) {
            case 1: length1 = 1; 
            break;
            case 2: length2 = 1;
            break;
            case 3: length1 = 1; length2 = 1;
            break;       
        }
        
        one = (length1 + width1) * hight;
        two = (length2 + width2) * hight;
        four =(length4 + width4) * hight;
        
        }
    
    
    
    
    
    
    public int getHight(){
        return hight;
    }
    
    public void setHight(int hight){
        this.hight = hight;
    }
    
     public int getWidth(){
        return width;
    }
    
    public void setWidth(int width){
        this.width = width;
    }
    
     public int getLength(){
        return length;
    }
    
    public void setLength(int length){
        this.length = length;
    }
    
    public int getFour(){
        return four;
    }
    
    public void setFour(int four){
        this.four = four;
    }
    
    public int getTwo(){
        return two;
    }
    
    public void setTwo(int two){
        this.two = two;
    }
    
    public int getOne(){
        return one;
    }
    
    public void setOne(int one){
        this.one = one;
    }
    public int getID(){
        return id;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    public String getStatus(){
        String tempStatus = null;
        switch(status){
            case 0: tempStatus = "not send";
            break;
            case 1: tempStatus = "send";
            break;
            case 2: tempStatus = "Arrived";
            break;
        }
        return tempStatus;
    }
    public void setStatus(int status){
        
    }
    
    
    
    
    
}
