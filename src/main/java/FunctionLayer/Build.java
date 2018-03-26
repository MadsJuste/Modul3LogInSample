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
    private int status;
    
    private int fourOne;
    private int fourTwo;
    private int fourThree;
    private int fourFour;
    private int fourTotal;
    
    private int twoOne;
    private int twoTwo;
    private int twoThree;
    private int twoFour;
    private int twoTotal;
    
    private int oneOne;
    private int oneTwo;
    private int oneThree;
    private int oneFour;
    private int oneTotal;
    
    private int id;
   
    
    public Build(int hight, int width, int length, int status){
        this.hight = hight;
        this.width = width;
        this.length = length;
        this.status = status;
        
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
        
        oneOne = oneThree = (width1) * hight;
        oneTwo = oneFour = (length1) * hight;
        twoOne = twoThree = (width2) * hight;
        twoTwo = twoFour = (length2) * hight;
        fourOne = fourThree =(width4) * hight;
        fourTwo = fourFour =(length4) * hight;
        oneTotal = oneOne + oneTwo + oneThree + oneFour;
        twoTotal = twoOne + twoTwo + twoThree + twoFour;
        fourTotal = fourOne + fourTwo + fourThree + fourFour;
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
    
    public int getFourOne(){
        return fourOne;
    }
    
    public void setFour(int four){
        this.fourOne = four;
    }
    public int getFourTwo(){
        return fourTwo;
    }
    
    public void setFourTwo(int four){
        this.fourTwo = four;
    }
    public int getFourThree(){
        return fourThree;
    }
    
    public void setFourThree(int four){
        this.fourThree = four;
    }
    public int getFourFour(){
        return fourFour;
    }
    
    public void setFourFour(int four){
        this.fourFour = four;
    }
    
    public int getTwoOne(){
        return twoOne;
    }
    public void setTwoOne(int two){
        this.twoOne = two;
    }
    public void setTwoTwo(int two){
        this.twoTwo = two;
    }
    public int getTwoTwo(){
        return twoTwo;
    }
    
    public void setTwoThree(int two){
        this.twoThree = two;
    }
    public int getTwoThree(){
        return twoThree;
    }
    
    public void setTwoFour(int two){
        this.twoFour = two;
    }
    public int getTwoFour(){
        return twoFour;
    }
    
  
    
    public int getOneOne(){
        return oneOne;
    }
    
    public void setOneOne(int one){
        this.oneOne = one;
    }
     public int getOneTwo(){
        return oneTwo;
    }
    
    public void setOneTwo(int one){
        this.oneTwo = one;
    }
     public int getOneThree(){
        return oneThree;
    }
    
    public void setOneThree(int one){
        this.oneThree = one;
    }
     public int getOneFour(){
        return oneFour;
    }
    
    public void setOneFour(int one){
        this.oneFour = one;
    }
    
    public int getFourTotal(){
        return fourTotal;
    }
    
    public void setfourTotal(int i){
        this.fourTotal = i;
    }
    
    public int getTwoTotal(){
        return twoTotal;
    }
    
    public void setTwoTotal(int i){
        this.twoTotal = i;
    }
    public int getOneTotal(){
        return oneTotal;
    }
    public void setOneTotal(int i){
        this.oneTotal=i;
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
        this.status = status;
    }
    
    
    
    
    
}
