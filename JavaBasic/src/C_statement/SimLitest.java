package C_statement;

import java.util.Scanner;

public class SimLitest {

	public static void main(String[] args) {
		
		String a = "����� A Ÿ�Դϴ�. AŸ���� ������� ���� ";
		String b = "����� B Ÿ�Դϵ�. BŸ���� �����ο� ����";
		String c = "����� C Ÿ�Դϴ�. C Ÿ���� ģ������ ����� ����";
		String d = "����� D Ÿ�Դϴ�. D Ÿ���� �� ���ִ� ����";
		
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �ݻ����");
		String str = scanner.nextLine();
		
		if(str.equals("��")) {
			
			System.out.println("�����Ҷ������ٴϴ�Ÿ���̴�");
			str = scanner.nextLine();
			
			if(str.equals("��")) {
				
				System.out.println("����ǥ���� ������ ���̴�");
				str =  scanner.nextLine();
				
				if(str.equals("��")) {
					System.out.println("�̼�ģ���� ������ �� ����");
					str = scanner.nextLine();
					
					if (str.equals("��")) {
						System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�.");
						str = scanner.nextLine();
						
						if (str.equals("��")) {
							System.out.println(d);
						}else if (str.equals("�ƴϿ�")) {
							System.out.println(c);
						}
						
						
					}else if (str.equals("�ƴϿ�")) {
						System.out.println(b);
					}
					
					
				}else if (str.equals("�ƴϿ�")) {
					System.out.println("Ȱ������ ����Ʈ�� ����");
					str =  scanner.nextLine();
					
					if (str.equals("��")) {
						System.out.println("�̼�ģ���� ������ �� ����");
						str =  scanner.nextLine();
						
						if(str.equals("��")) {
							System.out.println("�ƹ��͵� �ƴ��Ͽ� ���� �������� ���δ�.");
							str =  scanner.nextLine();
						
							if(str.equals("��")) {
								System.out.println(d);
								
							}else if(str.equals("�ƴϿ�")) {
								System.out.println(c);
							}
							
						}else if(str.equals("�ƴϿ�")) {
							System.out.println(b);
						}
					}else if(str.equals("�ƴϿ�")) {
						System.out.println("�ƹ��͵� �ƴ��Ͽ� ���� �������� ���δ�. ");
						str =  scanner.nextLine();
						if(str.equals("��")) {
							System.out.println(d);
						}else if (str.equals("�ƴϿ�")) {
							System.out.println(c);
						}
							
					}
				
				}
				
			}else if (str.equals("�ƴϿ�")){
				
				 System.out.println("����Ʈ�ڽ��� �̸�¥�°� ���ϴ�");
				 str =  scanner.nextLine();
				 if(str.equals("��")) {
					 System.out.println("Ȱ������ ����Ʈ�� ����");
					 str =  scanner.nextLine();
					 if (str.equals("��")) {
						 System.out.println("�̼�ģ���� ������ �� ����");
						 str =  scanner.nextLine();
						 if (str.equals("��")) {
							 System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�");
							 str =  scanner.nextLine();
							 if(str.equals("��")) {
								 System.out.println(d);
							 }else if (str.equals("�ƴϿ�")) {
								 System.out.println(c);
							 }
						 }else if (str.equals("�ƴϿ�")) {
							 
							 System.out.println(b);
						 }
					 
					 } else if(str.equals("�ƴϿ�")) {
						 System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�");
						 str =  scanner.nextLine();
						 if(str.equals("��")) {
							 System.out.println(d);
						 }else if(str.equals("�ƴϿ�")) {
							 System.out.println(c);
						 }
					 }
				}else if(str.equals("�ƴϿ�")) {
					System.out.println("����ǥ���� ������ ���̴�");
					str =  scanner.nextLine();
					if(str.equals("��")) {
						System.out.println("�̼�ģ���� ������ �� ����");
						str =  scanner.nextLine();
						if(str.equals("��")) {
							System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�");
							str =  scanner.nextLine();
							if(str.equals("��")) {
								System.out.println(d);
							}else if (str.equals("�ƴϿ�")) {
								System.out.println(c);
							}
						
						}else if (str.equals("�ƴϿ�")) {
							System.out.println(b);
							
						}
					}else if (str.equals("�ƴϿ�")) {
						System.out.println("Ȱ������ ����Ʈ�� ����");
						str = scanner.nextLine();
						if(str.equals("��")) {
							System.out.println("�̼�ģ���� ������ �� ����");
							str = scanner.nextLine();
							if (str.equals("��")) {
								System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�");
								str = scanner.nextLine();
								if(str.equals("��")) {
									System.out.println(d);
								}else if (str.equals("�ƴϿ�")) {
									System.out.println(c);
								}				
							}else if (str.equals("�ƴϿ�")) {
								System.out.println(b);
							}
						}else if (str.equals("�ƴϿ�")) {
							System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�");
							str = scanner.nextLine();
							if(str.equals("��")) {
								System.out.println(d);
							}else if (str.equals("�ƴϿ�")) {
								System.out.println(c);
							}
							
						}
					}
				}
				 
			}
		  
		
		}else if(str.equals("�ƴϿ�")) {
			System.out.println("�����⺹�� ũ�� �ʴ�");
			str =  scanner.nextLine();
			if(str.equals("��")) {
				System.out.println("������ ��� �ϰ� ��ٸ��� ���̴�");
				str =  scanner.nextLine();
				if(str.equals("��")) {
					System.out.println(a);
					
				}
			}else if (str.equals("�ƴϿ�")) {
				System.out.println("����ǥ���� ������ ���̴�");
				str =  scanner.nextLine();
			    if(str.equals("��")) {
					System.out.println("�̼�ģ���� ������ �� ����");
					str =  scanner.nextLine();
					if(str.equals("��")) {
						System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�.");
						str =  scanner.nextLine();
						if(str.equals("��")) {
							System.out.println(d);
						}else if (str.equals("�ƴϿ�")) {
							System.out.println(c);
						}
						
					}else if (str.equals("�ƴϿ�")) {
						System.out.println(b);
					}
					
					
				}else if(str.equals("�ƴϿ�")) {
					System.out.println("Ȱ������ ����Ʈ�� ����");
					str =  scanner.nextLine();
					if(str.equals("��")) {
						System.out.println("�̼�ģ���� ������ �� ����");
						str =  scanner.nextLine();
						if(str.equals("��")) {
							System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�.");
							str =  scanner.nextLine();
							if(str.equals("��")) {
								System.out.println(d);
							}else if(str.equals("�ƴϿ�")) {
								System.out.println(c);
							}
						}else if(str.equals("�ƴϿ�")) {
							System.out.println(b);
						}
					}else if(str.equals("�ƴϿ�")) {
						System.out.println("�ƹ��͵� �ƴ� �Ͽ� ���� �������� ���δ�.");
						str =  scanner.nextLine();
						if(str.equals("��")) {
							System.out.println(d);
							
						}else if (str.equals("�ƴϿ�")) {
							System.out.println(c);
						}
					}
				}
			}
		}

	
		


		
		
		// TODO Auto-generated method stub

	}

}
