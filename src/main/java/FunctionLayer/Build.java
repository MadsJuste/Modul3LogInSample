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
    private int depth;
    private int four;
    private int two;
    private int one;
    
    public Build(int hight, int width, int depth){
        this.hight = hight;
        this.width = width;
        this.depth = depth;
        setBlocks();
    }
    
    public void setBlocks(){
        
        int width1=0;
        int width2=0;
        int width4 = (width - 4)/4;
        int widthModu = (width - 4)%4;
        switch (widthModu) {
            case 1: width1 = 1; 
            break;
            case 2: width2 = 1;
            break;
            case 3: width1 = 1; width2 = 1;
            break;
                   
        }
        
        int depth1=0;
        int depth2=0;
        int depth4 = (width - 4)/4;
        int depthModu = (width - 4)%4;
        switch (depthModu) {
            case 1: depth1 = 1; 
            break;
            case 2: depth2 = 1;
            break;
            case 3: depth1 = 1; depth2 = 1;
            break;       
        }
        
        one = (depth1 + width1) * hight;
        two = (depth2 + width2) * hight;
        four = (depth4 + width4) * hight;
        
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
    
     public int getDepth(){
        return depth;
    }
    
    public void setDepth(int depth){
        this.depth = depth;
    }
}
