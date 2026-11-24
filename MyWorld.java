import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private long lastFrameTimeMS;
    private double timeStepDuration;

    public MyWorld()
    {    
        super(768, 576, 1, false);

        lastFrameTimeMS = System.currentTimeMillis();
        timeStepDuration = 1.0 / 60; // seems to be the default
        prepare();
    }

    public void started()
    {
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public void act()
    {
        timeStepDuration = (System.currentTimeMillis() - lastFrameTimeMS) / 1000.0;
        lastFrameTimeMS = System.currentTimeMillis();
    }

    public double getTimeStepDuration()
    {
        return timeStepDuration;
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Cannon cannon = new Cannon();
        addObject(cannon,138,520);
        Target target = new Target();
        addObject(target,407,277);
        Target target2 = new Target();
        addObject(target2,459,307);
        Target target3 = new Target();
        addObject(target3,518,354);
        Target target4 = new Target();
        addObject(target4,623,441);
        target.setLocation(281,238);
        target2.setLocation(512,257);
        target3.setLocation(602,374);
        target4.setLocation(675,493);
        target.setLocation(386,184);
        target4.setLocation(675,498);
        target4.setLocation(664,525);
        cannon.setLocation(123,491);
    }
}
