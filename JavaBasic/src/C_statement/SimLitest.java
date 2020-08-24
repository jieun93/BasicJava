package C_statement;

import java.util.Scanner;

public class SimLitest {

	public static void main(String[] args) {
		
		String a = "당신은 A 타입니다. A타입은 어른스러운 연애 ";
		String b = "당신은 B 타입니디ㅏ. B타입은 자유로운 연애";
		String c = "당신은 C 타입니다. C 타입은 친구같이 편안한 연애";
		String d = "당신은 D 타입니다. D 타입은 다 퍼주는 연애";
		
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나는 금사빠다");
		String str = scanner.nextLine();
		
		if(str.equals("네")) {
			
			System.out.println("연예할때끌려다니는타입이다");
			str = scanner.nextLine();
			
			if(str.equals("네")) {
				
				System.out.println("감정표현에 솔직한 편이다");
				str =  scanner.nextLine();
				
				if(str.equals("네")) {
					System.out.println("이성친구는 존재할 수 없다");
					str = scanner.nextLine();
					
					if (str.equals("네")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						str = scanner.nextLine();
						
						if (str.equals("네")) {
							System.out.println(d);
						}else if (str.equals("아니오")) {
							System.out.println(c);
						}
						
						
					}else if (str.equals("아니오")) {
						System.out.println(b);
					}
					
					
				}else if (str.equals("아니오")) {
					System.out.println("활동적인 데이트가 좋다");
					str =  scanner.nextLine();
					
					if (str.equals("네")) {
						System.out.println("이성친구는 존재할 수 없다");
						str =  scanner.nextLine();
						
						if(str.equals("네")) {
							System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다.");
							str =  scanner.nextLine();
						
							if(str.equals("네")) {
								System.out.println(d);
								
							}else if(str.equals("아니오")) {
								System.out.println(c);
							}
							
						}else if(str.equals("아니오")) {
							System.out.println(b);
						}
					}else if(str.equals("아니오")) {
						System.out.println("아무것도 아닌일에 쉽게 섭섭함이 쌓인다. ");
						str =  scanner.nextLine();
						if(str.equals("네")) {
							System.out.println(d);
						}else if (str.equals("아니오")) {
							System.out.println(c);
						}
							
					}
				
				}
				
			}else if (str.equals("아니오")){
				
				 System.out.println("데이트코스는 미리짜는게 편하다");
				 str =  scanner.nextLine();
				 if(str.equals("네")) {
					 System.out.println("활동적인 데이트가 좋다");
					 str =  scanner.nextLine();
					 if (str.equals("네")) {
						 System.out.println("이성친구는 존재할 수 없다");
						 str =  scanner.nextLine();
						 if (str.equals("네")) {
							 System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							 str =  scanner.nextLine();
							 if(str.equals("네")) {
								 System.out.println(d);
							 }else if (str.equals("아니오")) {
								 System.out.println(c);
							 }
						 }else if (str.equals("아니오")) {
							 
							 System.out.println(b);
						 }
					 
					 } else if(str.equals("아니오")) {
						 System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
						 str =  scanner.nextLine();
						 if(str.equals("네")) {
							 System.out.println(d);
						 }else if(str.equals("아니오")) {
							 System.out.println(c);
						 }
					 }
				}else if(str.equals("아니오")) {
					System.out.println("감정표현에 솔직한 편이다");
					str =  scanner.nextLine();
					if(str.equals("네")) {
						System.out.println("이성친구는 존재할 수 없다");
						str =  scanner.nextLine();
						if(str.equals("네")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							str =  scanner.nextLine();
							if(str.equals("네")) {
								System.out.println(d);
							}else if (str.equals("아니오")) {
								System.out.println(c);
							}
						
						}else if (str.equals("아니오")) {
							System.out.println(b);
							
						}
					}else if (str.equals("아니오")) {
						System.out.println("활동적인 데이트가 좋다");
						str = scanner.nextLine();
						if(str.equals("네")) {
							System.out.println("이성친구는 존재할 수 없다");
							str = scanner.nextLine();
							if (str.equals("네")) {
								System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
								str = scanner.nextLine();
								if(str.equals("네")) {
									System.out.println(d);
								}else if (str.equals("아니오")) {
									System.out.println(c);
								}				
							}else if (str.equals("아니오")) {
								System.out.println(b);
							}
						}else if (str.equals("아니오")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다");
							str = scanner.nextLine();
							if(str.equals("네")) {
								System.out.println(d);
							}else if (str.equals("아니오")) {
								System.out.println(c);
							}
							
						}
					}
				}
				 
			}
		  
		
		}else if(str.equals("아니오")) {
			System.out.println("감정기복이 크지 않다");
			str =  scanner.nextLine();
			if(str.equals("네")) {
				System.out.println("연락이 없어도 믿고 기다리는 편이다");
				str =  scanner.nextLine();
				if(str.equals("네")) {
					System.out.println(a);
					
				}
			}else if (str.equals("아니오")) {
				System.out.println("감정표현에 솔직한 편이다");
				str =  scanner.nextLine();
			    if(str.equals("네")) {
					System.out.println("이성친구는 존재할 수 없다");
					str =  scanner.nextLine();
					if(str.equals("네")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						str =  scanner.nextLine();
						if(str.equals("네")) {
							System.out.println(d);
						}else if (str.equals("아니오")) {
							System.out.println(c);
						}
						
					}else if (str.equals("아니오")) {
						System.out.println(b);
					}
					
					
				}else if(str.equals("아니오")) {
					System.out.println("활동적인 데이트가 좋다");
					str =  scanner.nextLine();
					if(str.equals("네")) {
						System.out.println("이성친구는 존재할 수 없다");
						str =  scanner.nextLine();
						if(str.equals("네")) {
							System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
							str =  scanner.nextLine();
							if(str.equals("네")) {
								System.out.println(d);
							}else if(str.equals("아니오")) {
								System.out.println(c);
							}
						}else if(str.equals("아니오")) {
							System.out.println(b);
						}
					}else if(str.equals("아니오")) {
						System.out.println("아무것도 아닌 일에 쉽게 섭섭함이 쌓인다.");
						str =  scanner.nextLine();
						if(str.equals("네")) {
							System.out.println(d);
							
						}else if (str.equals("아니오")) {
							System.out.println(c);
						}
					}
				}
			}
		}

	
		


		
		
		// TODO Auto-generated method stub

	}

}
