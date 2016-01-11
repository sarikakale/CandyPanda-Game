import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class CandyPanda extends World 
{
    Number num = new Number("Points: ");
    static int x=0;
    static int xc=0;
    //static int sc=0;
    Rules ruls;
    StartGame game;
    Points s=new Points();
   
    boolean c = true;
    public static boolean z = false;
    public static int num3=0, num1=0;
    Twice d;
     private int timer=5400;
    Text timerText = new Text();
     Levels level1=new Level1();
    LevelContext levelContext=new LevelContext(level1);
  private int y=-2;
      private GreenfootImage endTGame=new GreenfootImage("endGame1.jpg");
     // private GreenfootImage level1msg=new GreenfootImage("Level1Msg.jpg");
       private GreenfootSound backgroundMusic = new GreenfootSound("kung_fu_panda.mp3");

    public CandyPanda()
    {   
        
        super(600, 500, 1);
        //screen = new Screen( blackScreen );
        //addObject( screen, 400, 300 );
       // 
        this.showStartScreen();
        //Greenfoot.setWorld(this);
       
    }
    
            
    public void showStartScreen(){
        game = new StartGame();
        ruls = new Rules();
        addObject(ruls,300, 250);
        addObject(game,500,200);
      //  Greenfoot.playSound("kung_fu_panda.mp3");
        
    }
    
    public void removeInstructions(){
        this.removeObject(game);
        this.removeObject(ruls);
    }
    
    
    public void act() 
    {
        
        backgroundMusic.playLoop();
       if(game.getReset()==1) 
        reset();  
      
       
       
    }
    public void startTimer(World world){
          //wherever
          if(timer>0){
            timer--;
          
            timerText.setText("Time Left: "+timer/60);
            if(timer==0)
            Greenfoot.stop();
        }
    }
    public void reset()
    {
        if(c==true)
        {
         MouseInfo m = Greenfoot.getMouseInfo();
         if(m != null && Greenfoot.mousePressed(null)) {
            int x = m.getX();
            int y = m.getY();
            addObject(new Cutting(), x, y);
            c=false;
        }
    }
      if(timer>0){
            timer--;
          
            timerText.setText("Time Left: "+timer/60);
            if(timer==0){
           // Greenfoot.stop();
            //nextLevel()
           // timer=1800;
            if(levelContext.getLevel()!=null){
             // LevelChanger levelchanger=new LevelChanger();
               // getLevelButto();
               GreenfootImage img=new GreenfootImage(120,10);
              // setImage(img);
              Depict depict=new Depict();
                getNextLevelMessage( depict,levelContext.getNextLevelMessage(levelContext.getLevel()));
                
                  
                  Greenfoot.delay(300);
               
                levelContext.changeLevelBackground(this,levelContext.getLevel());
             
           levelContext.setLevel(levelContext.nextLevel());
           y=y-1    ;
          //Levels level2=new Level2();
           //levelContext.setLevel(level2);
           if(levelContext.getLevel()!=null){
           System.out.println(levelContext.getLevel());
           levelContext.getLevel().setTimerLevel();
           timer=levelContext.getLevel().getTimer();
           depict.remove(this);
          
           this.removeObjects(this.getObjects(Candy.class));
           this.removeObjects(this.getObjects(ExtraPoints.class));
        }else{
           
            
         this.endGame();
        }
    }
            
        }
        }
    
    
        if(z==true){
        if(Greenfoot.getRandomNumber(300) < 3) {
            xc=Greenfoot.getRandomNumber(600);
            if(xc>=20 && xc<=580)           // so that candy does'nt go out of the screen
            {
                x=Greenfoot.getRandomNumber(5);                 
              switch(x)
              {           
                case 0:
                  addObject(new Poison(), xc, 500);
                    //break;
                case 1:
                  addObject(CandyStore.create(CandyType.MILKYWAY,y),xc, 500);
                  break;
                case 2:
                  addObject((CandyStore.create(CandyType.TWIX,y)),xc, 500);
                  break;
                case 3:
                  addObject((CandyStore.create(CandyType.SNICKERS,y)),xc, 500);
                  break;
                case 4:
                  Gems b = (Gems)CandyStore.create(CandyType.GEMS,y);
                  b.addChildren(this);
                 // System.out.println("Loop value " + this);
                  addObject(b,xc, 500);
                  break;
              }
              if((num.getValue()>0 && num.getValue()%200==0) && num3==0 )
              {
                num3=1;
                addObject(ExtraPoints.create(ExtraPointType.TWICE), xc,500);
              }

            }   
            
            if((num.getValue()>0 && num.getValue()%200!=0 && num.getValue()%100==0) && num1==0 )
              {
                num1=1;
                addObject(ExtraPoints.create(ExtraPointType.ADDITIONAL), 0,Greenfoot.getRandomNumber(500));
              }
        }
    }
    }
    public void num(int score, CandyPanda fn)
    {
      num3=0;
      num1=0;
     // System.out.println("Adding"+score);
      num.add(score);      //score on the screen being incremented
      s = new Points();   
      s.addScore(score,fn);       //score on final display
    }
    
    
    
    public void getNextLevelMessage(Depict dp,String msg){
        
         
                dp.display(msg,this);
               
        
        
    }
    
   public void getNextLevelButton(){
       
       Button button=new Button();
       GreenfootImage goToNextLevel=new GreenfootImage("ButtonNextLevel.png");
        button.setImage(goToNextLevel);
        this.addObject(button,200,75);
       //GreenfootImage endGame=new GreenfootImage("EndGame.png");
      // button.setImage(endGame);
       
       
    }

    public void endGame() 
    {
         removeObject(num);
       //  
       this.removeObjects(this.getObjects(null));
      // this.setBackground(endTGame);
        addObject(new EndGame(),getWidth()/2, getHeight()/2);
        addObject(new PointBoard(s.getScore()), getWidth()/2, getHeight()/2);
        s.setScore(0);
       // Greenfoot.playSound("remove.wav");
        Greenfoot.stop();
        game.setReset(0);
    }


    public void populate()
    {
        addObject(num, 100, 460);
         addObject(timerText, 100, 15);
    }
    
    public void addObjectFromActor(Candy f, int a, int b)
    {
        addObject(f,a,b);
    }
    
}
