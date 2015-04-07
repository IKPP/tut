package final_project;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class ControllerOfGame extends JFrame{

	
	
	
////////////////////////////////////////////////////////////////
	
	
	
Player P1= new Player(1);
Player P2= new Player(2);
Player P3= new Player(3);
Player P4= new Player(4);


Creature Dragon=new Creature("Old Dragon","Desert",4,"",true,true);
Creature GSpider=new Creature("Giant Spider","Desert",1);
Creature Elephant=new Creature("Elephant","Jungle",4,"C",false,false);
Creature BKnight=new Creature("Brown Knight","Mountain",4,"C",false,false);
Creature Giant=new Creature("Giant","Mountain",4,"R",false,false);
Creature Dwarves=new Creature("Dwarves","Mountain",2,"R",false,false);

Creature Skeletons=new Creature("Skeletons","Desert",1);
Creature Watusi=new Creature("Watusi","Jungle",2);
Creature Goblins=new Creature("Goblins","Mountain",1);
Creature Ogre=new Creature("Ogre","Mountain",2);
Creature PterodactylWarriors=new Creature("PterodactylWarriors","Jungle",2,"*R",true,false);
Creature SandWorm=new Creature("Sandworm","Desert",3);
Creature GreenKnight=new Creature("GreenKnight","Forest",2,"C",false,false);
Creature Dervish=new Creature("Dervish","Desert",2,"",false,true);
Creature Crocodiles=new Creature("Crocodiles","Jungle",2);
Creature Nomads=new Creature("Nomads","Desert",1);
Creature Druid=new Creature("Druid","Forest",3,"",false,true);
Creature WalkingTree=new Creature("WalkingTree","Forest",5);
Creature CrawlingVines=new Creature("CrawlingVines","Jungle",6);
Creature Bandits=new Creature("Bandits","Forest",2);

Creature Centaur=new Creature("Centaur","Plains",2);
Creature CamelCorps=new Creature("CamelCorps","Desert",3);
Creature Farmers=new Creature("Farmers","Plains",1);
Creature Genie=new Creature("Genie","Desert",4,"",true,false);
Creature Pygmies=new Creature("Pygmies","Jungle",2);
Creature GreatHunter=new Creature("GreatHunter","Plains",4,"R",false,false);
Creature WitchDoctor=new Creature("WitchDoctor","Jungle",2,"",true,false);
Creature Tribesman=new Creature("Tribesman","Plains",2);

Creature GiantLizard=new Creature("GiantLizard","Swamp",2);
Creature Villians=new Creature("Villians","Plains",2);
Creature Tigers=new Creature("Tigers","Jungle",3);
Creature VampireBat=new Creature("VampireBat","Swamp",4,"",true,false);
Creature DarkWizard=new Creature("DarkWizard","Swamp",1,"",true,true);
Creature BlackKnight=new Creature("BlackKnight","Swamp",3,"C",false,false);
Creature GiantApe=new Creature("GiantApe","Jungle",5);
Creature BuffaloHerd=new Creature("BuffaloHerd","Plains",3);



public void do_this()
{
	
	PlayerStack Temp = new PlayerStack();
	//Temp=new PlayerStack();
	Temp.AddCreatureToStack(Dragon);
	Temp.AddCreatureToStack(GSpider);
	Temp.AddCreatureToStack(Elephant);
	Temp.AddCreatureToStack(BKnight);
	Temp.AddCreatureToStack(Giant);
	Temp.AddCreatureToStack(Dwarves);


	P1.PlayerArmy.AddStack(Temp);

	Temp=new PlayerStack();
	Temp.AddCreatureToStack(Skeletons);
	Temp.AddCreatureToStack(Watusi);
	Temp.AddCreatureToStack(Goblins);
	Temp.AddCreatureToStack(Ogre);

	P1.PlayerArmy.AddStack(Temp);


	System.out.println("PLAYER 1:");
	P1.PlayerArmy.PrintArmy();

	PlayerStack Temp2= new PlayerStack();

	Temp2.AddCreatureToStack(PterodactylWarriors);
	Temp2.AddCreatureToStack(SandWorm);
	Temp2.AddCreatureToStack(GreenKnight);
	Temp2.AddCreatureToStack(Dervish);
	Temp2.AddCreatureToStack(Crocodiles);
	Temp2.AddCreatureToStack(Nomads);
	Temp2.AddCreatureToStack(Druid);
	Temp2.AddCreatureToStack(WalkingTree);
	Temp2.AddCreatureToStack(CrawlingVines);
	Temp2.AddCreatureToStack(Bandits);

	P2.PlayerArmy.AddStack(Temp2);
	System.out.println("PLAYER 2:");
	P2.PlayerArmy.PrintArmy();



	PlayerStack Temp3= new PlayerStack();

	Temp3.AddCreatureToStack(Centaur);
	Temp3.AddCreatureToStack(CamelCorps);
	Temp3.AddCreatureToStack(Farmers);
	Temp3.AddCreatureToStack(Farmers);

	P3.PlayerArmy.AddStack(Temp3);

	Temp3= new PlayerStack();

	Temp3.AddCreatureToStack(Genie);
	Temp3.AddCreatureToStack(Skeletons);
	Temp3.AddCreatureToStack(Pygmies);

	P3.PlayerArmy.AddStack(Temp3);

	Temp3= new PlayerStack();

	Temp3.AddCreatureToStack(GreatHunter);
	Temp3.AddCreatureToStack(Nomads);
	Temp3.AddCreatureToStack(WitchDoctor);

	P3.PlayerArmy.AddStack(Temp3);

	System.out.println("PLAYER 3:");
	P3.PlayerArmy.PrintArmy();



	PlayerStack Temp4= new PlayerStack();

	Temp4.AddCreatureToStack(Tribesman);
	Temp4.AddCreatureToStack(GiantLizard);
	Temp4.AddCreatureToStack(Villians);
	Temp4.AddCreatureToStack(Tigers);

	P4.PlayerArmy.AddStack(Temp4);

	Temp4= new PlayerStack();

	Temp4.AddCreatureToStack(VampireBat);
	Temp4.AddCreatureToStack(Tribesman);
	Temp4.AddCreatureToStack(DarkWizard);
	Temp4.AddCreatureToStack(BlackKnight);

	P4.PlayerArmy.AddStack(Temp4);

	Temp4= new PlayerStack();

	Temp4.AddCreatureToStack(GiantApe);
	Temp4.AddCreatureToStack(BuffaloHerd);

	P4.PlayerArmy.AddStack(Temp4);


	System.out.println("PLAYER 4:");
	P4.PlayerArmy.PrintArmy();

	SpecialIncomeCounter city=new City();
	SpecialIncomeCounter village=new Village();
	SpecialIncomeCounter mine=new Mine();
	System.out.println(mine.IncomeValue);

	P1.AddAnSICToHex(city);
	P1.AddAnSICToHex(village);
	P1.AddAnSICToHex(mine);

	P1.setTotalGold(P1.getTotalGold()+P1.calculate_income());
	P2.setTotalGold(P2.getTotalGold()+P2.calculate_income());
	P3.setTotalGold(P3.getTotalGold()+P3.calculate_income());
	P4.setTotalGold(P4.getTotalGold()+P4.calculate_income());

	System.out.println("Total income of player 1 is " + P1.calculate_income());
	System.out.println("Total gold of player 1 is " + P1.getTotalGold());
	System.out.println("Total income of player 2 is " + P2.calculate_income());
	System.out.println("Total gold of player 2 is " + P2.getTotalGold());
	System.out.println("Total income of player 3 is " + P3.calculate_income());
	System.out.println("Total gold of player 3 is " + P3.getTotalGold());
	System.out.println("Total income of player 4 is " + P4.calculate_income());
	System.out.println("Total gold of player 4 is " + P4.getTotalGold());

}


    
    
    

	
	
	///////////////////////////////////////////////////////////////////////////

	GameGui gameObj = new GameGui();

	ControlMarkers marker = new ControlMarkers(); 
	int dX;
	int dY;
	int dX1;
	int dY1;
	int checkImg = 0;

	Tiles [] tilesArr;

	JPanel currentTile;
	
	JPanel markerPanel;

	ImageIcon img  = new ImageIcon("imagess/tile-Desert.png");
	
	
	/*public void storingTheTiles(String str, int x, int y, Tiles tile)
	{
		tilesArr[k].setName("Desert");

		tilesArr[k].setX(x);
		tilesArr[k].setY(y);
		System.out.println("x ki val "+ tile.getX());
		
	}*/

	public ControllerOfGame(String str)
	{
		super(str);
		

		this.setLayout(null);
		
		
		/////////////////////////////////
		
		/////////////////////////////////////



		// setting the background color or the frame
		this.getContentPane().setBackground(Color.black);
		this.setSize(800, 800);


		tilesArr = new Tiles[gameObj.getNum()];

		for (int i =0;i<gameObj.getNum();i++)
		{
			tilesArr[i] = new Tiles();
		}

		for( int i=0;i< gameObj.getNum();i++)
		{
			final int k = i;
			final ControllerOfGame obj = this;

			gameObj.getTiles(k).addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent e) 
				{
					// TODO Auto-generated method stub
					if(SwingUtilities.isRightMouseButton(e))
					{
						if(checkImg ==0)
						{
							if(k<=5)
							{
								
								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Desert.png")));


								dX1 = gameObj.getTiles(k).getX();
								//System.out.println("asdfasdfasdfdfas "+ dX1);
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);

								// storing the name and location of the tiles
								//storingTheTiles("Desert",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Desert");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
							//	System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								
								/////////////////////////////////
								
								
								
								checkImg++;
								obj.revalidate();

							}
							if(k>5 && k<=11)
							{

								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Forest.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								/*storingTheTiles("Forest",dX1,dY1,tilesArr[k]);
								System.out.println("name "+tilesArr[k].getNameOfHex() + " k "+k);
								*/
								tilesArr[k].setName("Forest");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
							//	System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								/////////////////////////////////


								checkImg++;
								obj.revalidate();

							}
							if(k>11 && k<=17)
							{

								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Jungle.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								//storingTheTiles("Jungle",dX1,dY1,tilesArr[k]);]
								tilesArr[k].setName("Jungle");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
								//System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								
								/////////////////////////////////

							//	System.out.println("repain karney laga hu");
								checkImg++;
								obj.revalidate();

							}
							if(k>17 && k<=23)
							{

								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Swamp.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								//storingTheTiles("Swamp",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Swamp");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
							//	System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								
								/////////////////////////////////

								System.out.println("repain karney laga hu");
								checkImg++;
								obj.revalidate();

							}
							if(k>23 && k<=29)
							{

								//System.out.println("right click ho gaya hu hu haha");
								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Mountain.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								//storingTheTiles("Mountain",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Mountain");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
							//	System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								/////////////////////////////////

								checkImg++;
								obj.revalidate();


							}
							if(k>29 && k<=35)
							{

							//	System.out.println("right click ho gaya hu hu haha");
								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Plaines.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();


								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								//storingTheTiles("Plains",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Plain");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
								//System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								
								/////////////////////////////////


								checkImg++;
								obj.revalidate();

							}
							if(k>35 && k<=41)
							{

							//	System.out.println("right click ho gaya hu hu haha");
								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-Frozen.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);
								
								// storing the name and location of the tiles
								//storingTheTiles("Frozen",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Frozen");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
								//System.out.println("x ki val "+ tilesArr[k].getX());
							//	System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								/////////////////////////////////

								//System.out.println("repain karney laga hu");
								checkImg++;
								obj.revalidate();
								//obj.repaint();
								//System.out.println("repain kar ia laga hu");
							}
							if(k>41 && k<=43)
							{
								//img = new ImageIcon("imagess/tile-Forest");
								//System.out.println("right click ho gaya hu hu haha");
								gameObj.getTiles(k).removeAll();
								gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile-sea.png")));


								dX1 = gameObj.getTiles(k).getX();
								dY1 = gameObj.getTiles(k).getY();

								gameObj.getTiles(k).setVisible(true);
								gameObj.getTiles(k).setOpaque(false);

								// storing the name and location of the tiles
							//	storingTheTiles("Sea",dX1,dY1,tilesArr[k]);
								tilesArr[k].setName("Sea");

								tilesArr[k].setX(dX1);
								tilesArr[k].setY(dY1);
								//System.out.println("x ki val "+ tilesArr[k].getX());
								//System.out.println("arwaa tile ka x "+tilesArr[k].getX());
								/////////////////////////////////
								
								//System.out.println("repain karney laga hu");
								checkImg++;
								obj.revalidate();
								//obj.repaint();
								//System.out.println("repain kar ia laga hu");
							}

						}
						else
						{
							//System.out.println("aslkfdhskhjadf");

							gameObj.getTiles(k).removeAll();

							gameObj.getTiles(k).add(new JLabel(new ImageIcon("imagess/tile_back.png")));
							gameObj.getTiles(k).setVisible(true);
							gameObj.getTiles(k).setOpaque(false);
							checkImg = 0;
							obj.revalidate();
							//checkImg = 0;
						}



					}

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

					if (gameObj.getTiles(k).contains(e.getPoint())) {
						System.out.println("mouse is pressedasfdsdfa"+gameObj.getTiles(k).getLocation());
						dX = e.getX();
						dY = e.getY();
						currentTile = gameObj.getTiles(k);
					//	System.out.println("dX ki val "+ dX);
					}

				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					currentTile = null;
					
	
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});
			gameObj.getTiles(k).addMouseMotionListener(new MouseMotionListener()

			//this.addMouseMotionListener(new MouseMotionListener()
			{

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub

					if (gameObj.getTiles(k) == null) return;
					//System.out.println();
					//this.tile.getPanel()[1].getTile().setLocation(e.getX() - dX, e.getY() - dY);
					//	this.tile.getPanel()[0].setLocation(e.getX() - dX, e.getY() - dY);
					//if(tile.getPanel()[1])


					System.out.println("mosue is pressed and its true");
					//gameObj.getTiles(k).setLocation(e.getX(), e.getY());
					currentTile.setLocation(e.getX() + gameObj.getTiles(k).getX()-dX, e.getY() + gameObj.getTiles(k).getY()-dY);



				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub

				}

			});
		}///////////////////// ends the tiles listeners


		//////////// for the markers
		for(int i =0;i<marker.numOfMarkers;i++)
		{
			final int k =i;
			final ControllerOfGame obj = this;
			marker.getMarker(k).addMouseListener(new MouseListener()
			{

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub


				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					if (marker.getMarker(k).contains(e.getPoint())) {
						//System.out.println("mouse is pressedasfdsdfa"+marker.getMarker(k).getLocation());
						dX = e.getX();
						dY = e.getY();
						currentTile = marker.getMarker(k);
						System.out.println("dX ki val "+ dX);
					}
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					int o;
					for(int u=0;u<gameObj.getNum();u++)
					{
						if(((tilesArr[u].getX())+85)>(marker.getMarker(k).getX()) && ((tilesArr[u].getX())<(marker.getMarker(k).getX())) 
						&& ((tilesArr[u].getY())+73)>(marker.getMarker(k).getY()) && ((tilesArr[u].getY())<(marker.getMarker(k).getY()))) 
						{
							//o=0;
							//while(o<tilesArr.length)
							//{
								
								//System.out.println("in for loop");
								//System.out.println("tiles ka x "+tilesArr[0].getX() + "width 85");
								
								//System.out.println("marker ka x "+marker.getMarker(k).getX() );
								
						if(k>=0 && k<=9)
						{
							P1.Add_tiles(tilesArr[u]);
							
							//System.out.println("hex ka naam hai "+tilesArr[u].getNameOfHex());
						}
						
						else if(k>=10 && k<=19)
						{
							P2.Add_tiles(tilesArr[u]);
							
							//System.out.println("hex ka naam hai "+tilesArr[u].getNameOfHex());
						}
						else if(k>=20 && k<=29)
						{
							P3.Add_tiles(tilesArr[u]);
							
							//System.out.println("hex ka naam hai "+tilesArr[u].getNameOfHex());
						}
						else if(k>=29 && k<=39)
						{
							P4.Add_tiles(tilesArr[u]);
							
							//System.out.println("hex ka naam hai "+tilesArr[u].getNameOfHex());
						}
						
						
							//o++;
						//}
						}
	
					}
					
					System.out.println("Player 1 tiles are: ");
					
					for(int y=0;y<P1.Tiles_of_player.size();y++)
					{
						System.out.println(P1.Tiles_of_player.get(y).getNameOfHex());
					}
					
					System.out.println("Player 2 tiles are: ");
					
					for(int y=0;y<P2.Tiles_of_player.size();y++)
					{
						System.out.println(P2.Tiles_of_player.get(y).getNameOfHex());
					}
					
					System.out.println("Player 3 tiles are: ");
					
					for(int y=0;y<P3.Tiles_of_player.size();y++)
					{
						System.out.println(P1.Tiles_of_player.get(y).getNameOfHex());
					}
					
					System.out.println("Player 4 tiles are: ");
					
					for(int y=0;y<P4.Tiles_of_player.size();y++)
					{
						System.out.println(P1.Tiles_of_player.get(y).getNameOfHex());
					}
					

					
				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}


			});
			
			marker.getMarker(k).addMouseMotionListener(new MouseMotionListener()
			{

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					if (marker.getMarker(k) == null) return;
					

					//System.out.println("mosue is pressed and its true");
					//gameObj.getTiles(k).setLocation(e.getX(), e.getY());
					currentTile.setLocation(e.getX() + marker.getMarker(k).getX()-dX, e.getY() + marker.getMarker(k).getY()-dY);
					
				/*	if(marker.getMarker(k).getX()> tilesArr[k].getX() && marker.getMarker(k).getX()< tilesArr[k].getX() +tilesArr[k].width)
					{
					//	System.out.println("the name of the tile is "+tilesArr[k].getNameOfHex());
						System.out.println("tile ka x pos "+tilesArr[k].getX()+" and tile ki width "+tilesArr[k].width+" marker ka x "+marker.getMarker(k).getX());
					}*/
					
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
		}


		/////////////////////////////// ends here






		for(int i=0; i<marker.getNumOfMark();i++)
		{
			this.getContentPane().add(marker.getMarker(i));
		}

		for(int i=0; i< gameObj.getNum();i++)
		{

			this.getContentPane().add(gameObj.getTiles(i));
		}

		


		this.setDefaultCloseOperation(EXIT_ON_CLOSE);



	}


	protected void paintComponent(Graphics g) {
		System.out.println("paint karney k liye aaya hau");
		super.paintComponents(g);
		//g.drawImage(img.getImage(), dX1, dY1, img.getIconWidth(), img.getIconHeight(), null);
		/*g.drawImage(backgroundImg, 0, 0, null);
	    for(ImageInfo add : additions){
	        g.drawImage(add.getImage(), add.getX(), add.getY(), null);
	    }*/
	}


	public void update()
	{
		this.setLayout(null);

	}
	public static void main(String[] args)
	{
		
	ControllerOfGame gameShowObj = new ControllerOfGame("Kings'&Things");
		gameShowObj.setVisible(true);
		gameShowObj.do_this();
	}

}
