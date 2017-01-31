/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grayscale;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Thomas
 */
public class GrayScale {

     /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    BufferedImage inputImage = ImageIO.read(new File("C:/Users/Thomas/Desktop/bigredFootball.jpg"));
    
  //  BufferedImage outputImage = new BufferedImage(inputImage.getWidth(), inputImage.getHeight(), BufferedImage.TYPE_INT_RGB);
    
    //ColorConvertOp op = new ColorConvertOp(inputImage.getColorModel().getColorSpace(), ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
    //op.filter(inputImage, outputImage);
    
    for(int y = 0; y < inputImage.getHeight();  y++)
        {
            for(int x = 0; x < inputImage.getWidth(); x++)
            {
                int rgb = inputImage.getRGB(x, y);
                int iRed = (rgb >> 16) & 0xFF;
                int iGreen = (rgb >> 8) & 0xFF;
                int iBlue = (rgb & 0xFF);
                
                int graylev = (int) (iRed * 0.299 + iGreen * 0.587 + iBlue * 0.114);
                int gray = (graylev << 16) + (graylev << 8) + graylev;
                
                
                inputImage.setRGB(x, y, gray);
             
                // float x_old = x;
               // float y_old = y;
                
              //  int pixelFirst = inputImage.getRGB((int)x_old, (int)y_old );
              //  int pixelSecond =  inputImage.getRGB(
               //         Math.min((int)x_old + 1, inputImage.getWidth() - 1), 
               //        (int)y_old  );
                
            //    Color cFirst = new Color(pixelFirst);
            //    Color cSecond = new Color(pixelSecond);
                
             //   float iValue = (float)x/10.0f -  (int)(x/10);
                
             //   int iRed = (int) ((1 - iValue) * cFirst.getRed() + iValue * cSecond.getRed());
            //    int iGreen = (int) ((1 - iValue) * cFirst.getGreen() + iValue * cSecond.getGreen());
            //    int iBlue = (int) ((1 - iValue) * cFirst.getBlue() + iValue * cSecond.getBlue());
                
             //   Color iColor = new Color((int) (iRed * 0.299 + iGreen * 0.587 + iBlue * 0.114));
                
              //  int iPixel = iColor.getRGB();
                
                
                
                
              //  outputImage.setRGB(x, y, iPixel);
        }
         
    }
     ImageIO.write(inputImage, "PNG", new File("c:/Users/Thomas/Desktop/grayPhoto.png") );
    }
}
