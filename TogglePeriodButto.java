import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TogglePeriodButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TogglePeriodButto extends Student
{
    public TogglePeriodButto(String Image) 
    {
	setImage("button.jpg");
    }
    
    public int currentPeriod = 2;

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            if (currentPeriod == 2) {
                currentPeriod = 3;
            } 
            else 
            {
                currentPeriod = 2;
            }
        }
    }
}