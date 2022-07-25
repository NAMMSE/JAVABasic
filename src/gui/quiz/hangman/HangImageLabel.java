package gui.quiz.hangman;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class HangImageLabel extends JLabel{
	// 이미지 크기 조절하는 클래스
	static int imageSize = 460;
	public HangImageLabel(String path) {
		// 이미지 크기 조절하기(구글링)
		
		// ImageIO.read(file) : 해당 이미지 파일을 읽어서 BufferedImage 인스턴스로 만든다
		// getScaledInstance(width, height, hint) : 크기 조절된 이미지 인스턴스를 반환한다
		try {
			setIcon(new ImageIcon(// 500으로 설정한 상태에서 20씩 레이아웃 자르고 460짜리 이미지로 맞추려고
					ImageIO.read(new File(path)).getScaledInstance(imageSize, imageSize, Image.SCALE_SMOOTH))); 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
