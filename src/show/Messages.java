package show;

import java.io.IOException;

public class Messages {

	StringBuilder sb = new StringBuilder();

	public StringBuilder grettingsMenu() {
		sb.delete(0, sb.length());
		sb.append("Welcome to the employee manager app! \n\n");
		sb.append("choose the following options: \n");
		sb.append("1 - Add a employee\n");
		sb.append("2 - Remove a employee\n");
		sb.append("3 - Mass addition\n");
		sb.append("4 - Search by name\n");
		sb.append("5 - Payments");
		sb.append("6 - Exit\n");

		return sb;
	}
	
	public void cls () throws IOException, InterruptedException {
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}

}
