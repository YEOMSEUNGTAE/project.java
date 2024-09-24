
import javax.swing.*;
import java.awt.event.*;


public class test2 extends JFrame {
	JTable table;
	JScrollPane scroll; 
    JTextField[] inputFields;

    JButton addButton;
	String[] [] data; 
	String[] title = {"년도","학년/학기","이수구분","영역","강의명",
					"교수명","학점","성적","여부","합계" }; 
	public test2(){
		
		data = new String[3][10];

		data[0][0]="21";
		data[0][1]="�迬��";
		data[0][2]="010-2888-0077";
		data[0][3]="yuna@naver.com";
		
		data[1][0]="2";
		data[1][1]="����ȯ";
		data[1][2]="011-748-5236";
		data[1][3]="park@hanmail.net";
		
		data[2][0]="3";
		data[2][1]="����ȣ";
		data[2][2]="010-5685-5258";
		data[2][3]="chanho@nate.com";
		
        
		table=new JTable(data,title); 
		scroll = new JScrollPane(table);
		add(scroll);
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
				int row = table.getSelectedRow(); 
				int col = table.getSelectedColumn();
				System.out.println("row index����" + row);
				System.out.println("column index����"+ col);
				System.out.println(data[row][col]);
			}
			
		});
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		//setSize(400,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new test2();

	}

	

}
