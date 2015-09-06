package actionListener;

import house.Location;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import others.MainT;
import player.Player;
import basicFrame.BFrame;

public class UseRoadBlockAction implements ActionListener{

	private BFrame basicFrame;
	static Player[] player;
	JTextField[] showPlayerInfo;
	
	public UseRoadBlockAction(BFrame frame) {
		this.basicFrame = frame;
		
		}
		public UseRoadBlockAction()
		{
			
		}
	
		public void actionPerformed(ActionEvent e) {
		
			ButtonDiceAction btnDA =new ButtonDiceAction();
			int flag = btnDA.getFlag();
			
			if(flag==1 && player[flag-1].getState()!=3)
			{
			    
			    List<JButton> labelList = basicFrame.getButtonList();
			    
			    if(player[flag-1].getRoadBlock()>0)
			    {
			    
			    if(Integer.parseInt(basicFrame.getBlockLocation().getText().trim())>10
			    	||Integer.parseInt(basicFrame.getBlockLocation().getText().trim())<-10)
			    {
			    	JOptionPane.showMessageDialog(basicFrame.getFrame(), "������(-10,10)���ڵ�����");
			    }
			    
			    
			    else
			    {
			    int loclab=Integer.parseInt(basicFrame.getBlockLocation().getText().trim());//���label�е�Stringֵ��ת����int��
			    
			    JOptionPane.showMessageDialog(null,basicFrame.getBlockLocation().getText().trim()+player[flag-1].getPlayerName());
			    
			    int locply= player[flag-1].getLocation();//��õ�ǰ��ҵĵ�ֵַ
			    
			    int loclast=loclab+locply;
			    
			    if(loclast<0)
			    loclast+=70;
			    
			   
			    Location loc3 = MainT.markLocation.get(loclast);//���Ҫ����ը����λ�õĶ���
				
				if(loc3.getIsToolState()=="isBomb")//�жϸ�λ�õĵ���״̬
				{
					JOptionPane.showMessageDialog(null, "�˴���ը�����������·�ϣ�");
					
				}
				else if (loc3.getIsToolState()=="isRoadBlock")
				{
					JOptionPane.showMessageDialog(null, "�˴���·�ϣ��������·�ϣ�");
					
				} 
				else if (loc3.getIsToolState()=="isForbid")
				{
					JOptionPane.showMessageDialog(null, "�˴����ڹ����������������·�ϣ�");
					
				} 
				else 
				{
					loc3.setIsToolState("isRoadBlock");
					int NumBolck = player[flag-1].getRoadBlock()-1;//�����ҵ�·����
					player[flag-1].setRoadBlock(NumBolck);//����ҵ�·������һ
					
				
                    String oldText = labelList.get(loc3.getLocation()).getText();
					
					labelList.get(loc3.getLocation()).setText(oldText+"/R");//��ʾ��λ��·�ϣ�������
				     
				    basicFrame.getBlockLocation().setText("          ");}
			}
			    }
				
			    
			    else
			    {
			    	JOptionPane.showMessageDialog(null, player[flag-1].getPlayerName()+"û��·�ϣ�");
			    }
		}
			
			
			if(flag==2 &&  player[flag-1].getState()!=3)
			{
				
				

			    List<JButton> labelList = basicFrame.getButtonList();
			    
			    if(player[flag-1].getRoadBlock()>0)
			    {
			    
			    if(Integer.parseInt(basicFrame.getBlockLocation().getText().trim())>10
			    	||Integer.parseInt(basicFrame.getBlockLocation().getText().trim())<-10)
			    {
			    	JOptionPane.showMessageDialog(basicFrame.getFrame(), "������(-10,10)���ڵ�����");
			    }
			    
			    
			    else
			    {
			    int loclab=Integer.parseInt(basicFrame.getBlockLocation().getText().trim());//���label�е�Stringֵ��ת����int��
			    
			    JOptionPane.showMessageDialog(null,basicFrame.getBlockLocation().getText().trim()+player[flag-1].getPlayerName());
			    
			    int locply= player[flag-1].getLocation();//��õ�ǰ��ҵĵ�ֵַ
			    
			    int loclast=loclab+locply;
			    if(loclast<0)
				    loclast+=70;
			   
			    Location loc3 = MainT.markLocation.get(loclast);//���Ҫ����ը����λ�õĶ���
				
				if(loc3.getIsToolState()=="isBomb")//�жϸ�λ�õĵ���״̬
				{
					JOptionPane.showMessageDialog(null, "�˴���ը�����������·�ϣ�");
					
				}
				else if (loc3.getIsToolState()=="isRoadBlock")
				{
					JOptionPane.showMessageDialog(null, "�˴���·�ϣ��������·�ϣ�");
					
				} 
				else if (loc3.getIsToolState()=="isForbid")
				{
					JOptionPane.showMessageDialog(null, "�˴����ڹ����������������·�ϣ�");
					
				} 
				else 
				{
					loc3.setIsToolState("isRoadBlock");
					int NumBolck = player[flag-1].getRoadBlock()-1;//�����ҵ�·����
					player[flag-1].setRoadBlock(NumBolck);//����ҵ�·������һ
					
				
                    String oldText = labelList.get(loc3.getLocation()).getText();
					
					labelList.get(loc3.getLocation()).setText(oldText+"/R");//��ʾ��λ��·�ϣ�������
				     
				    basicFrame.getBlockLocation().setText("          ");}
			}
			    }
				
			    
			    else
			    {
			    	JOptionPane.showMessageDialog(null, player[flag-1].getPlayerName()+"û��·�ϣ�");
			    }
				
				
				
				
			}
			
			
			if(player.length>=3) {
				if(flag==3) {
					if(player[flag-1].getState()!=3) {
						
						List<JButton> labelList = basicFrame.getButtonList();
					    
					    if(player[flag-1].getRoadBlock()>0)
					    {
					    
					    if(Integer.parseInt(basicFrame.getBlockLocation().getText().trim())>10
					    	||Integer.parseInt(basicFrame.getBlockLocation().getText().trim())<-10)
					    {
					    	JOptionPane.showMessageDialog(basicFrame.getFrame(), "������(-10,10)���ڵ�����");
					    }
					    
					    
					    else
					    {
					    int loclab=Integer.parseInt(basicFrame.getBlockLocation().getText().trim());//���label�е�Stringֵ��ת����int��
					    
					    JOptionPane.showMessageDialog(null,basicFrame.getBlockLocation().getText().trim()+player[flag-1].getPlayerName());
					    
					    int locply= player[flag-1].getLocation();//��õ�ǰ��ҵĵ�ֵַ
					    
					    int loclast=loclab+locply;
					    
					    if(loclast<0)
						    loclast+=70;
					   
					    Location loc3 = MainT.markLocation.get(loclast);//���Ҫ����ը����λ�õĶ���
						
						if(loc3.getIsToolState()=="isBomb")//�жϸ�λ�õĵ���״̬
						{
							JOptionPane.showMessageDialog(null, "�˴���ը�����������·�ϣ�");
							
						}
						else if (loc3.getIsToolState()=="isRoadBlock")
						{
							JOptionPane.showMessageDialog(null, "�˴���·�ϣ��������·�ϣ�");
							
						} 
						else if (loc3.getIsToolState()=="isForbid")
						{
							JOptionPane.showMessageDialog(null, "�˴����ڹ����������������·�ϣ�");
							
						} 
						else 
						{
							loc3.setIsToolState("isRoadBlock");
							int NumBolck = player[flag-1].getRoadBlock()-1;//�����ҵ�·����
							player[flag-1].setRoadBlock(NumBolck);//����ҵ�·������һ
							
						
							String oldText = labelList.get(loc3.getLocation()).getText();
							
							labelList.get(loc3.getLocation()).setText(oldText+"/R");//��ʾ��λ��·�ϣ�������
						     
						    basicFrame.getBlockLocation().setText("          ");}
					}
					    }
						
					    
					    else
					    {
					    	JOptionPane.showMessageDialog(null, player[flag-1].getPlayerName()+"û��·�ϣ�");
					    }
						
					}
				}
				
				
				
				if(flag==4) {
					if(player[flag-1].getState()!=3) {
						List<JButton> labelList = basicFrame.getButtonList();
					    
					    if(player[flag-1].getRoadBlock()>0)
					    {
					    
					    if(Integer.parseInt(basicFrame.getBlockLocation().getText().trim())>10
					    	||Integer.parseInt(basicFrame.getBlockLocation().getText().trim())<-10)
					    {
					    	JOptionPane.showMessageDialog(basicFrame.getFrame(), "������(-10,10)���ڵ�����");
					    }
					    
					    
					    else
					    {
					    int loclab=Integer.parseInt(basicFrame.getBlockLocation().getText().trim());//���label�е�Stringֵ��ת����int��
					    
					    JOptionPane.showMessageDialog(null,basicFrame.getBlockLocation().getText().trim()+player[flag-1].getPlayerName());
					    
					    int locply= player[flag-1].getLocation();//��õ�ǰ��ҵĵ�ֵַ
					    
					    int loclast=loclab+locply;
					    
					    if(loclast<0)
						    loclast+=70;
					   
					    Location loc3 = MainT.markLocation.get(loclast);//���Ҫ����ը����λ�õĶ���
						
						if(loc3.getIsToolState()=="isBomb")//�жϸ�λ�õĵ���״̬
						{
							JOptionPane.showMessageDialog(null, "�˴���ը�����������·�ϣ�");
							
						}
						else if (loc3.getIsToolState()=="isRoadBlock")
						{
							JOptionPane.showMessageDialog(null, "�˴���·�ϣ��������·�ϣ�");
							
						} 
						else if (loc3.getIsToolState()=="isForbid")
						{
							JOptionPane.showMessageDialog(null, "�˴����ڹ����������������·�ϣ�");
							
						} 
						else 
						{
							loc3.setIsToolState("isRoadBlock");
							int NumBolck = player[flag-1].getRoadBlock()-1;//�����ҵ�·����
							player[flag-1].setRoadBlock(NumBolck);//����ҵ�·������һ
							
						
							String oldText = labelList.get(loc3.getLocation()).getText();
							
							labelList.get(loc3.getLocation()).setText(oldText+"/R");//��ʾ��λ��·�ϣ�������
						     
						    basicFrame.getBlockLocation().setText("          ");}
					}
					    }
						
					    
					    else
					    {
					    	JOptionPane.showMessageDialog(null, player[flag-1].getPlayerName()+"û��·�ϣ�");
					    }
						
					}
					}
				
					}
			
		
			/**
			 * ����2����3����4����תЧ��
			 */
			if(player.length==2) {
				flag = (flag%2==0) ? 1 : 2;
			} else if (player.length==3) {
				if(flag==3) {
					flag=1;
				} else {
					flag++;
				}
			} else {
				if(flag==4) {
					flag=1;
				} else {
					flag++;
				}
			}
			

			
			
			
			
			
			
			
		}
		
		
		
		
		
}
