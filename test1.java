
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class test1 extends JFrame {
    // 테이블에 들어갈 데이터와 열 제목 배열
    String[][] data;
    String[] title = {"년도", "학년/학기", "이수구분", "영역", "강의명",
                      "교수명", "학점", "성적", "여부", "합계"};
    
    JTable table;
    JScrollPane scroll;
    JTextField[] inputFields;
    JButton addButton;

    public test1() {
        // 데이터 배열 크기를 설정 (예: 3행 10열)
        data = new String[3][10];

        // GUI 설정
        setTitle("교과과정 이수관리 프로그램");
        setSize(800, 400);
        setLayout(new BorderLayout());
        
        // 입력 필드를 위한 패널 생성
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 10));

        // 텍스트 필드를 배열로 저장해 여러 필드를 생성
        inputPanel.setLayout(new GridLayout(10, 2));

        /*JTextField[] inputFields = new JTextField[10];
        for (int i = 0; i < 10; i++) {
        inputFields[i] = new JTextField();
        inputPanel.add(new JLabel(title[i]));  // 라벨 추가 (세로로)
        inputPanel.add(inputFields[i]);        // 텍스트 필드 추가 (세로로)
        }*/

        // 버튼 생성 및 추가
        /*addButton = new JButton("추가");
        inputPanel.add(addButton);
        */
        // 테이블 생성 및 스크롤 추가
        table = new JTable(data, title);
        scroll = new JScrollPane(table);
        
        // 추가 버튼 클릭 이벤트 처리
        /*addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addRow();  // 새 행 추가 메소드 호출
            }
        });
        */
        
        // 프레임에 추가
        add(inputPanel, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // 사용자가 입력한 값을 테이블에 추가하는 메소드
    /*private void addRow() {
        // 빈 행을 찾는다.
        for (int i = 0; i < data.length; i++) {
            if (data[i][0] == null) {  // 첫 번째 열이 비어 있으면 해당 행은 사용 가능
                for (int j = 0; j < 10; j++) {
                    data[i][j] = inputFields[j].getText();  // 입력 필드에서 값을 가져와 배열에 저장
                }
                table.repaint();  // 테이블을 새로고침하여 화면에 반영
                break;
            }
        }
    }*/

    public static void main(String[] args) {
        new test1();
    }
}
