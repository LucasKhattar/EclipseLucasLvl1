import java.awt.Color;
import java.util.MissingFormatArgumentException;
import java.util.Random;

import org.teachingextensions.logo.Colors;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
	public static void main(String[] args) throws Exception {
		GridWorld grid = new GridWorld();
		grid.run();
	}

	public void run() throws InterruptedException {
		world.show();
		Location location = new Location(5, 5);
		world.add(location, bug);
		Random random = new Random();
		int a = random.nextInt(10);
		int b = random.nextInt(10);
		Location locations = new Location(a, b);
		world.add(locations, bugs);
		Location locate = new Location(a, b + 1);
		world.add(locate, flower);
		bugs.setColor(Colors.getRandomColor());
		Location locatio = new Location(a, b - 1);
		world.add(locatio, flower);
		// for (int i = 0; i < 1000000; i++) {
		// Thread.sleep(500);
		bugs.turn();
		bugs.setColor(Colors.getRandomColor());
		// }
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				Flower flowers = new Flower();
				if (i <= 4 && j <= 5) {
					flowers.setColor(Color.BLUE);
				} else if (i % 2 == 0) {
					flowers.setColor(Color.RED);
				} else {
					flowers.setColor(Color.WHITE);
				}
				Location loc = new Location(i, j);
				world.add(loc, flowers);
			}

		}
	}

	World world = new World();
	Bug bug = new Bug();
	Bug bugs = new Bug();
	Flower flower = new Flower();
}
