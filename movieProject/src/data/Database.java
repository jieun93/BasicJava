package data;

import java.util.ArrayList;
import java.util.Calendar;

import vo.MovieCartVO;
import vo.MovieVO;
import vo.PaymentVO;
import vo.ReviewVO;
import vo.SnackCartVO;
import vo.SnackCategoryVO;
import vo.SnackVO;
import vo.TheaterScheduleVO;
import vo.TheaterVO;
import vo.UserVO;

public class Database {

	private static Database instance;

	private Database() {}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();
		}
		return instance;
	}

	public ArrayList<UserVO> tb_user = new ArrayList<>();
	{
		UserVO user = new UserVO();
		user.setUserId("admin");
		user.setUserPwd("admin");
		user.setUserName("관리자");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("951007");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("hyojin");
		user.setUserPwd("4321");
		user.setUserName("효진");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("951007");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("woogyung");
		user.setUserPwd("4321");
		user.setUserName("우경");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("950807");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("jieun");
		user.setUserPwd("4321");
		user.setUserName("지은");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("930329");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("hyeokjin");
		user.setUserPwd("4321");
		user.setUserName("혁진");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("030102");  //18세
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("kiwan");
		user.setUserPwd("4321");
		user.setUserName("기완");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("941215");
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("jongwan");
		user.setUserPwd("4321");
		user.setUserName("십삼세");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("080231");  //13세
		tb_user.add(user);
		
		user = new UserVO();
		user.setUserId("meja");
		user.setUserPwd("4567");
		user.setUserName("열세");
		user.setUserPhone("010-1234-5678");
		user.setUserReg1("110101");  //10세
		tb_user.add(user);
	}

	public ArrayList<SnackVO> tb_snack = new ArrayList<>();
	{
		SnackVO snack = new SnackVO();
		// 팝콘--------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(0);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("맛있는팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);
		
		snack = new SnackVO();
		snack.setSnackNum(1);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("고소팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(2);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("고소팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(3);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("달콤팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(4);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("달콤팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(5);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("바질어니언팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(6);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("바질어니언팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(7);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("더블치즈팝콘(M)");
		snack.setSnackPrice(5500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(8);
		snack.setSnackCategoryNum(0);
		snack.setSnackName("더블치즈팝콘(L)");
		snack.setSnackPrice(6000);
		tb_snack.add(snack);

		// 음료---------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(9);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("콜라(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(10);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("콜라(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(11);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("사이다(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(12);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("사이다(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(13);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("환타오렌지(M)");
		snack.setSnackPrice(2200);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(14);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("환타오렌지(L)");
		snack.setSnackPrice(2700);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(15);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("레몬에이드(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(16);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("레몬에이드(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(17);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("복숭아 아이스티(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(18);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("복숭아 아이스티(L)");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(19);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("아메리카노(M)");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(20);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("아메리카노(L)");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(21);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("카스");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(22);
		snack.setSnackCategoryNum(1);
		snack.setSnackName("생수");
		snack.setSnackPrice(1500);
		tb_snack.add(snack);

		// 스낵류-------------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(23);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("나쵸");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(24);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("즉석구이오징어");
		snack.setSnackPrice(5000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(25);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("치즈볼");
		snack.setSnackPrice(4500);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(26);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("핫도그");
		snack.setSnackPrice(4000);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(27);
		snack.setSnackCategoryNum(2);
		snack.setSnackName("맛밤");
		snack.setSnackPrice(3500);
		tb_snack.add(snack);

		// 세트메뉴--------------------------------------
		snack = new SnackVO();
		snack.setSnackNum(28);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보A★\t   고소팝콘(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(8900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(29);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보B★\t   달콤/바질어니언/더블치즈(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(9900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(30);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★콤보C★\t   칠리치즈나쵸 1 + 고소팝콘(L) 1 + 탄산음료(M) 2");
		snack.setSnackPrice(11900);
		tb_snack.add(snack);

		snack = new SnackVO();
		snack.setSnackNum(31);
		snack.setSnackCategoryNum(3);
		snack.setSnackName("★스타워즈세트★    고소팝콘(L) 1 + 탄산음료(M) 2 + 히든컵 + 키링");
		snack.setSnackPrice(16000);
		tb_snack.add(snack);
		// -------------------------------------

	}

	   
	public ArrayList<SnackCategoryVO> tb_snackCategory = new ArrayList<>();
    {   
       SnackCategoryVO snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(0);
       snackCategory.setSnackCategoryName("팝콘");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(1);
       snackCategory.setSnackCategoryName("음료");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(2);
       snackCategory.setSnackCategoryName("스낵");
       tb_snackCategory.add(snackCategory);
       
       snackCategory = new SnackCategoryVO();
       snackCategory.setSnackCategoryNum(3);
       snackCategory.setSnackCategoryName("세트");
       tb_snackCategory.add(snackCategory);
       
    }

	public ArrayList<MovieVO> tb_movie = new ArrayList<>();
	{

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 43);
		MovieVO movie = new MovieVO();
		movie.setMovieNum(0); // 영화번호
		movie.setMovieName("겨울왕국2"); // 영화명
		movie.setMovieRating("전체 관람가"); // 관람연령
		movie.setMovieCast("크리스틴 벨, 이디나 멘젤, 조시 게드"); // 출연진
		movie.setMovieDirector("크리스 벅, 제니퍼 리"); // 감독
		movie.setMovieStory("위험에 빠진 아렌델 왕국을 구해야만 하는 엘사와 안나는 숨겨진 과거의 진실을 찾아\r\n"
				+ " 크리스토프, 올라프 그리고 스벤과 함께 위험천만한 놀라운 모험을 떠나게 된다."); // 줄거리
		movie.setRunTime(cal); // 영화런타임시간 //1시간 43분
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 57);
		movie = new MovieVO();
		movie.setMovieNum(1);
		movie.setMovieName("해치지않아");
		movie.setMovieRating("12세");
		movie.setMovieCast("안재홍, 강소라, 박영규");
		movie.setMovieDirector("손재곤");
		movie.setMovieStory("생계형 수습 변호사 ‘태수’에게 찾아온 일생일대의 기회, 위기의 동물원 ‘동산파크’를 구하라!\r\n"
				+ " 이런 동물원 처음 봐? 선을 넘은 녀석들의 과감한 도전이 시작된다!");
		movie.setRunTime(cal); // "1시간 57분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 32);
		movie = new MovieVO();
		movie.setMovieNum(2);
		movie.setMovieName("스타워즈");
		movie.setMovieRating("12세");
		movie.setMovieCast("데이지 리들리 , 마크 해밀, 아담 드라이버, 오스카 아이삭");
		movie.setMovieDirector("라이언 존슨");
		movie.setMovieStory("선과 악의 전쟁, 거대한 운명이 결정된다!\r\n"
				+ " 누가 빛이고 누가 어둠이 될 것인가? 지금, 선과 악의 운명을 건 거대한 전쟁이 시작된다!");
		movie.setRunTime(cal); // "2시간 32분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 4);
		movie = new MovieVO();
		movie.setMovieNum(3);
		movie.setMovieName("나쁜녀석들");
		movie.setMovieRating("청소년 관람불가");
		movie.setMovieCast("윌 스미스, 마틴 로렌스");
		movie.setMovieDirector("아딜 엘 아르비, 빌랄 팔라");
		movie.setMovieStory("가족만큼 중요한 마이크를 위해 마커스가 합류하고, 우리의 ‘나쁜 녀석들’은 \r\n+"
				+ "신식 무기와 기술을 장착한 루키팀 AMMO와 함께 힘을 합쳐 일생일대 마지막 미션을 수행하게 되는데");
		movie.setRunTime(cal); // "2시간 4분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 15);
		movie = new MovieVO();
		movie.setMovieNum(4);
		movie.setMovieName("작은아씨들");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("시엘샤 로넌, 엠마왓슨, 플로렌스 퓨, 티모시 샬라메, 엘리자 스캐런");
		movie.setMovieDirector("크레타 거윅");
		movie.setMovieStory("그해 겨울, 사랑스러운 자매들을 만났다\r\n"
				+ "7년 후, 어른이 된 그들에겐 각기 다른 숙제가 놓이게 되는데… ");
		movie.setRunTime(cal); // "2시간 15분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 13);
		movie = new MovieVO();
		movie.setMovieNum(5);
		movie.setMovieName("극장판 미니특공대: 공룡왕 디노");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("신용우, 엄상현, 이소영, 전태열, 양정화, 남도형");
		movie.setMovieDirector("이영준");
		movie.setMovieStory("호기심 많은 소년 '얀'은 공룡왕 열쇠로 '디노'를 만나 비밀친구가 된다.\r\n"
				+ " 그러던 중 우주악당 '퀸'이 지구를 위협하고 이에 '미니특공대'는 공룡왕 '디노'와 함께 역대급 대결을 펼치는데..!");
		movie.setRunTime(cal); // "1시간 13분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 42);
		movie = new MovieVO();
		movie.setMovieNum(6);
		movie.setMovieName("스파이 지니어스");
		movie.setMovieRating("전체 관람가");
		movie.setMovieCast("윌 스미스, 톰 홀랜드, 라시다 존스 ,DJ 칼리드");
		movie.setMovieDirector("닉 브루노, 트로이 콴");
		movie.setMovieStory("잘나가는 슈퍼 스파이!엉뚱한 슈퍼 지니어스를 만나 한순간에 ‘새’ 됐다!?\r\n"
				+ "  나는 놈 & 별난 놈, ‘새’ 상초월 극한 팀플레이가 시작된다!");
		movie.setRunTime(cal); // "1시간 42분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 27);
		movie = new MovieVO();
		movie.setMovieNum(7);
		movie.setMovieName("인셉션");
		movie.setMovieRating("12세 관람가");
		movie.setMovieCast("레오나르도 디카프리오, 와타나베 켄, 조셉 고든 레빗");
		movie.setMovieDirector("크리스토퍼 놀란");
		movie.setMovieStory("꿈 VS 현실   시간, 규칙, 타이밍 모든 것이 완벽해야만 하는,\r\n"
				+ "단 한 번도 성공한 적 없는 ‘인셉션’ 작전이 시작된다!");
		movie.setRunTime(cal); // "2시간 27분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 44);
		movie = new MovieVO();
		movie.setMovieNum(8);
		movie.setMovieName("정직한 후보");
		movie.setMovieRating("12세 관람가");
		movie.setMovieCast("라미란, 김무열, 나문희, 윤경호");
		movie.setMovieDirector("장유정");
		movie.setMovieStory("어제까진 뻥쟁이, 오늘부턴 정직한 후보?!\r\n"
				+ " 웃음 빵! 속이 뻥! 뚫리는 통쾌한 웃음 폭격이 시작된다!");
		movie.setRunTime(cal); // "1시간 44분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 53);
		movie = new MovieVO();
		movie.setMovieNum(9);
		movie.setMovieName("미스터 주: 사라진 VIP");
		movie.setMovieRating("12세 관람가");
		movie.setMovieCast("이성민, 김서형, 배정남, 신하균");
		movie.setMovieDirector("김태윤");
		movie.setMovieStory("동물의 말이 들리는 순간,수사의 파트너가 바뀐다!\r\n"
				+ " 도심 한복판, 사라진 VIP를 찾기 위한 인간과 동물들의 역대급 팀플레이가 시작된다!"
				+ " 웃음 빵! 속이 뻥! 뚫리는 통쾌한 웃음 폭격이 시작된다!");
		movie.setRunTime(cal); // "1시간 53분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 54);
		movie = new MovieVO();
		movie.setMovieNum(10);
		movie.setMovieName("남산의 부장들");
		movie.setMovieRating("15세 관람가");
		movie.setMovieCast("이병헌, 이성민, 곽도원, 이희준, 김소진");
		movie.setMovieDirector("우민호");
		movie.setMovieStory("“각하, 제가 어떻게 하길 원하십니까”\r\n"
				+ " 1979년 10월 26일, 중앙정보부장 김규평(이병헌)이 대한민국 대통령을 암살한다.");
		movie.setRunTime(cal); // "1시간 54분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 50);
		movie = new MovieVO();
		movie.setMovieNum(11);
		movie.setMovieName("히트맨");
		movie.setMovieRating("15세 관람가");
		movie.setMovieCast("권상우, 정준호, 황우슬혜, 이이경, 이지원");
		movie.setMovieDirector("최원섭");
		movie.setMovieStory(" 웹툰 작가가 된 전설의 암살요원, 그의 히트 본능이 깨어난다!");
		movie.setRunTime(cal); // "1시간 50분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 38);
		movie = new MovieVO();
		movie.setMovieNum(12);
		movie.setMovieName("나이트 헌터");
		movie.setMovieRating("15세 관람가");
		movie.setMovieCast("헨리 카빌, 알렉산드라 다드다리오");
		movie.setMovieDirector("데이비드 레이몬드");
		movie.setMovieStory("놈을 잡은 날, 단서가 흩어졌다!\r\n"
				+ " 최악의 싸이코패스와 완벽한 살인, 그리고 조각난 진실을 사냥하라!");
		movie.setRunTime(cal); // "1시간 38분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 2);
		cal.set(Calendar.MINUTE, 41);
		movie = new MovieVO();
		movie.setMovieNum(13);
		movie.setMovieName(" 원스 어폰 어 타임... 인 할리우드");
		movie.setMovieRating("청소년 관람불가");
		movie.setMovieCast("레오나르도 디카프리오, 브래드 피트, 마고 로비");
		movie.setMovieDirector("쿠엔틴 타란티노");
		movie.setMovieStory("형편상 더 이상 함께 일할 수 없게 된 ‘릭’과 ‘클리프’는 각자의 길을 가기로 하고\r\n"
				+ " ‘릭’의 집에서 술을 거나하게 마시던 중 뜻하지 않은 낯선 방문객을 맞이하게 되는데…");
		movie.setRunTime(cal); // "2시간 41분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 1);
		cal.set(Calendar.MINUTE, 53);
		movie = new MovieVO();
		movie.setMovieNum(14);
		movie.setMovieName("페인 앤 글로리");
		movie.setMovieRating("청소년 관람불가");
		movie.setMovieCast("페넬로페 크루즈, 안토니오 반데라스");
		movie.setMovieDirector("페드로 알모도바르");
		movie.setMovieStory("“영화를 못 찍는다면 내 인생은 의미가 없어”\r\n"
				+ " 강렬했던 첫사랑, 찬란했던 욕망, 괴로웠던 이별, 가장 솔직한 거장의 세계를 들여다본다!");
		movie.setRunTime(cal); // "1시간 53분"
		movie.setState(true);
		tb_movie.add(movie);

		cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 3);
		cal.set(Calendar.MINUTE, 00);
		movie = new MovieVO();
		movie.setMovieNum(15);
		movie.setMovieName("가장 따뜻한 색, 블루");
		movie.setMovieRating("청소년 관람불가");
		movie.setMovieCast("아델 에그자르코풀로스, 레아 세이두, 샐림 케치오체");
		movie.setMovieDirector("압델라티프 케시시");
		movie.setMovieStory("15살 소녀 ‘아델’, 파란 머리의 신비로운 소녀 ‘엠마’를 만나다!\r\n"
				+ " ‘아델’은 자신과 전혀 다른 삶을 살아온 ‘엠마’로 인해 이전에는 몰랐던 뜨거운 감정을 느끼게 되고,평온하기만 했던 ‘아델’의 삶은 뒤흔들리기 시작한다.");
		movie.setRunTime(cal); // "3시간"
		movie.setState(true);
		tb_movie.add(movie);

	}

    public ArrayList<TheaterScheduleVO> tb_theaterSchedule = new ArrayList<>();
    {
    	Calendar cal = Calendar.getInstance();
        TheaterScheduleVO ts = new TheaterScheduleVO();

        // 2/9 시간표----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(0); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(1); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(2); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(3); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(4); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(5); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(6); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(7); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(8); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(9); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(10); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);

        // 2/10 시간표----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(11); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(12); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(13); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(14); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(15); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(16); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(17); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(18); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(19); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(20); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 9);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(21); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);

        // 2/11 시간표----------------------------------

        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(22); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(23); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(24); // 상영시간표번호
        ts.setMovieNum(0); // 영화번호(MovieVO참조) //겨울왕국
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(25); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(26); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(27); // 상영시간표번호
        ts.setMovieNum(1); // 영화번호(MovieVO참조) //해치지않아
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(28); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(2); // 상영관번호(TheaterVO참조) //아이맥스
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 10:10
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 18);
        cal.set(Calendar.MINUTE, 20);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(29); // 상영시간표번호
        ts.setMovieNum(2); // 영화번호(MovieVO참조) //스타워즈
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 18:20
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 14);
        cal.set(Calendar.MINUTE, 40);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(30); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 14:40
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 00);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(31); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(1); // 상영관번호(TheaterVO참조) //4D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:00
        tb_theaterSchedule.add(ts);

        cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal.set(Calendar.MONTH, 1);
        cal.set(Calendar.DATE, 11);
        cal.set(Calendar.HOUR_OF_DAY, 22);
        cal.set(Calendar.MINUTE, 10);
        ts = new TheaterScheduleVO();
        ts.setScheduleNum(31); // 상영시간표번호
        ts.setMovieNum(3); // 영화번호(MovieVO참조) //나쁜녀석들
        ts.setTheaterNum(0); // 상영관번호(TheaterVO참조) //2D
        ts.setMovieStartTime(cal); // 상영시작시간 //2020-02-9 / 22:10
        tb_theaterSchedule.add(ts);
    	
    }
    
    public ArrayList<TheaterVO> tb_theater = new ArrayList<>();
    {
    	TheaterVO tt = new TheaterVO();
    	tt.setTheaterNum(0);  //상영관번호
    	tt.setTheaterName("2D");  //상영관 이름
    	tt.setSeatCount(50);  //좌석 수
    	tb_theater.add(tt);
    	
    	tt = new TheaterVO();
    	tt.setTheaterNum(1);  //상영관번호
    	tt.setTheaterName("4D");  //상영관 이름
    	tt.setSeatCount(40);  //좌석 수
    	tb_theater.add(tt);

    	tt = new TheaterVO();
    	tt.setTheaterNum(2);  //상영관번호
    	tt.setTheaterName("아이맥스관");  //상영관 이름
    	tt.setSeatCount(30);  //좌석 수
    	tb_theater.add(tt);
    }
    
    public ArrayList<PaymentVO> tb_payment = new ArrayList<>();
    {
       PaymentVO pp = new PaymentVO();
       Calendar cal = Calendar.getInstance();
       pp.setPaymentNum(0); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 20);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);

       pp = new PaymentVO();
       pp.setPaymentNum(1); // 결제번호
       pp.setUserId("kiwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);

       pp = new PaymentVO();
       pp.setPaymentNum(2); // 결제번호
       pp.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 2);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(3); // 결제번호
       pp.setUserId("jieun"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 23);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(4); // 결제번호
       pp.setUserId("jongwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 10);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(5); // 결제번호
       pp.setUserId("woogyung"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(6); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 27);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(7); // 결제번호
       pp.setUserId("kiwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(8); // 결제번호
       pp.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 23);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(9); // 결제번호
       pp.setUserId("jieun"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 12);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(10); // 결제번호
       pp.setUserId("jongwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(11); // 결제번호
       pp.setUserId("woogyung"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 16);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(12); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 30);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(13); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(14); // 결제번호
       pp.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 11);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(15); // 결제번호
       pp.setUserId("jieun"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 14);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(16); // 결제번호
       pp.setUserId("jongwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("계좌이체"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(17); // 결제번호
       pp.setUserId("woogyung"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(18); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("신용카드"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2019);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 27);
       cal.set(Calendar.HOUR_OF_DAY, 12);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(19); // 결제번호
       pp.setUserId("kiwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 10);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(20); // 결제번호
       pp.setUserId("hyojin"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 17);
       cal.set(Calendar.MINUTE, 23);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
       
       pp = new PaymentVO();
       pp.setPaymentNum(21); // 결제번호
       pp.setUserId("kiwan"); // 회원아이디(UserVO참조)
       pp.setPaymentForm("휴대폰결제"); // 결제방식
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 25);
       cal.set(Calendar.HOUR_OF_DAY, 21);
       cal.set(Calendar.MINUTE, 11);
       pp.setPaymentDate(cal);
       tb_payment.add(pp);
    

    }    
    
    public ArrayList<MovieCartVO> tb_movieCart = new ArrayList<>();
    {
       MovieCartVO movieCart = new MovieCartVO();
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(0); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(19); // 좌석 선책한 위치
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조)
       movieCart.setScheduleNum(4); // 상영시간표(TheaterScheduleVO참조
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(1); // 영화카트번호
       movieCart.setUserId("kiwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(18); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(0); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(2); // 영화카트번호
       movieCart.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(17); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(4); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(9000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(3); // 영화카트번호
       movieCart.setUserId("jieun"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(16); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(1); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(5); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(4); // 영화카트번호
       movieCart.setUserId("jongwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(15); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(5); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(5); // 영화카트번호
       movieCart.setUserId("woogyung"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(14); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(7); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(6); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(13); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(1); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(5); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(7); // 영화카트번호
       movieCart.setUserId("kiwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(12); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(7); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(8); // 영화카트번호
       movieCart.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(11); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(10); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(9); // 영화카트번호
       movieCart.setUserId("jieun"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(10); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(1); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(10); // 영화카트번호
       movieCart.setUserId("jongwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(9); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(1); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(2); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(11); // 영화카트번호
       movieCart.setUserId("woogyung"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(8); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(3); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(12); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(7); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(4); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(13); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(6); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(1); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(5); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(14); // 영화카트번호
       movieCart.setUserId("hyeokjin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(5); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(6); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(15); // 영화카트번호
       movieCart.setUserId("jieun"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(4); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(7); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(16); // 영화카트번호
       movieCart.setUserId("jongwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(3); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(1); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(8); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(17); // 영화카트번호
       movieCart.setUserId("woogyung"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(2); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(7); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(18); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(1); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(9); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);

       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(19); // 영화카트번호
       movieCart.setUserId("kiwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(29); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(2); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(1); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);
       
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(20); // 영화카트번호
       movieCart.setUserId("hyojin"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(28); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(2); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);
       
       movieCart = new MovieCartVO();
       movieCart.setMovieCartNum(21); // 영화카트번호
       movieCart.setUserId("kiwan"); // 회원아이디(UserVO참조)
       movieCart.setSeatLocation(25); // 좌석 선책한 위치 //0~20까지
       movieCart.setPaymentNum(0); // 결제번호(PaymentVO참조) //0~2까지
       movieCart.setScheduleNum(2); // 상영시간표(TheaterScheduleVO참조)
       movieCart.setMoviePrice(12000); // 영화가격
       tb_movieCart.add(movieCart);
    }
    
    public ArrayList<ReviewVO> tb_review = new ArrayList<>();
    {
       // 리뷰리스트 영화별로 하나씩 만들기
       ReviewVO review = new ReviewVO();
       Calendar cal = Calendar.getInstance();
       
       review.setReviewNum(0);
       review.setUserId("kiwan");
       review.setReviewGrade("★★☆☆☆");
       review.setReviewContent("유치해요");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(0); // 영화PK저장 (영화제목을 들고있는거)
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(1);
       review.setUserId("hyojin");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("재밌어요");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 20);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(2);
       review.setUserId("hyojin");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("짱 재밌어요");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 29);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(2);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(3);
       review.setUserId("hyeokjin");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("흥미진진 재밌어요 짱!");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 13);
       cal.set(Calendar.MINUTE, 50);
       review.setReviewDate(cal);
       review.setMovieNum(9);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(4);
       review.setUserId("hyojin");
       review.setReviewGrade("★★★★★☆");
       review.setReviewContent("정말 감동적이었습니다");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 31);
       cal.set(Calendar.HOUR_OF_DAY, 15);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(12);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(5);
       review.setUserId("jieun");
       review.setReviewGrade("★☆☆☆☆");
       review.setReviewContent("실망 그자체");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 16);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 10);
       review.setReviewDate(cal);
       review.setMovieNum(8);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(6);
       review.setUserId("jongwan");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("환상적인 스토리였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 21);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 35);
       review.setReviewDate(cal);
       review.setMovieNum(8);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(7);
       review.setUserId("woogyung");
       review.setReviewGrade("★★★★☆");
       review.setReviewContent("정말 감동적이었습니다");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 22);
       cal.set(Calendar.HOUR_OF_DAY, 19);
       cal.set(Calendar.MINUTE, 23);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(8);
       review.setUserId("jieun");
       review.setReviewGrade("★★☆☆☆");
       review.setReviewContent("조금부족해도 웃긴영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 19);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 17);
       review.setReviewDate(cal);
       review.setMovieNum(6);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(9);
       review.setUserId("hyeokjin");
       review.setReviewGrade("★★★★☆");
       review.setReviewContent("몰입도가 높았습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 26);
       cal.set(Calendar.HOUR_OF_DAY, 15);
       cal.set(Calendar.MINUTE, 55);
       review.setReviewDate(cal);
       review.setMovieNum(4);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(10);
       review.setUserId("kiwan");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("익살스러운 영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 21);
       cal.set(Calendar.HOUR_OF_DAY, 21);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(11);
       review.setUserId("jongwan");
       review.setReviewGrade("★★☆☆☆");
       review.setReviewContent("실망 스러웠습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 4);
       cal.set(Calendar.HOUR_OF_DAY, 13);
       cal.set(Calendar.MINUTE, 47);
       review.setReviewDate(cal);
       review.setMovieNum(1);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(12);
       review.setUserId("woogyung");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("전형적인 한국영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 20);
       cal.set(Calendar.HOUR_OF_DAY, 10);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(11);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(13);
       review.setUserId("hyojin");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("눈물을 머금고 본 영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 29);
       cal.set(Calendar.HOUR_OF_DAY, 16);
       cal.set(Calendar.MINUTE, 21);
       review.setReviewDate(cal);
       review.setMovieNum(12);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(14);
       review.setUserId("jieun");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("연인과 함께 보기 좋은거 같습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 25);
       cal.set(Calendar.HOUR_OF_DAY, 22);
       cal.set(Calendar.MINUTE, 20);
       review.setReviewDate(cal);
       review.setMovieNum(14);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(15);
       review.setUserId("hyeokjin");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("스토리가 지루했습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 11);
       cal.set(Calendar.DATE, 17);
       cal.set(Calendar.HOUR_OF_DAY, 20);
       cal.set(Calendar.MINUTE, 27);
       review.setReviewDate(cal);
       review.setMovieNum(13);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(16);
       review.setUserId("kiwan");
       review.setReviewGrade("★★★☆☆");
       review.setReviewContent("조금 지루함이 느껴쟜습니다");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 6);
       cal.set(Calendar.HOUR_OF_DAY, 11);
       cal.set(Calendar.MINUTE, 03);
       review.setReviewDate(cal);
       review.setMovieNum(2);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(17);
       review.setUserId("jongwan");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("가족들과 보기 좋은영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 3);
       cal.set(Calendar.HOUR_OF_DAY, 19);
       cal.set(Calendar.MINUTE, 24);
       review.setReviewDate(cal);
       review.setMovieNum(9);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(18);
       review.setUserId("woogyung");
       review.setReviewGrade("★★★★★");
       review.setReviewContent("다시 보고 싶은 영화였습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 2);
       cal.set(Calendar.HOUR_OF_DAY, 20);
       cal.set(Calendar.MINUTE, 19);
       review.setReviewDate(cal);
       review.setMovieNum(4);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(19);
       review.setUserId("hyojin");
       review.setReviewGrade("★★☆☆☆");
       review.setReviewContent("스토리가 실망스러웠습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 1);
       cal.set(Calendar.DATE, 1);
       cal.set(Calendar.HOUR_OF_DAY, 17);
       cal.set(Calendar.MINUTE, 25);
       review.setReviewDate(cal);
       review.setMovieNum(1);
       tb_review.add(review);

       review = new ReviewVO();
       review.setReviewNum(20);
       review.setUserId("kiwan");
       review.setReviewGrade("★★★★☆");
       review.setReviewContent("연기력,스토리가 탄탄했습니다.");
       cal = Calendar.getInstance();
       cal.set(Calendar.YEAR, 2020);
       cal.set(Calendar.MONTH, 0);
       cal.set(Calendar.DATE, 28);
       cal.set(Calendar.HOUR_OF_DAY, 14);
       cal.set(Calendar.MINUTE, 36);
       review.setReviewDate(cal);
       review.setMovieNum(5);
       tb_review.add(review);
    }
    
    public ArrayList<SnackCartVO> tb_snackCart = new ArrayList<>();
    {
       SnackCartVO snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(0); //스낵카트번호
       snackCart.setUserId("hyojin");  //회원아이디
       snackCart.setSnackCount(0);  //스낵의 수량
       snackCart.setSnackNum(20);  //스낵번호(SnackVO참조)
       snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
       
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(1); //스낵카트번호
       snackCart.setUserId("hyojin");  //회원아이디
       snackCart.setSnackCount(0);  //스낵의 수량
       snackCart.setSnackNum(21);  //스낵번호(SnackVO참조)
       snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(2); //스낵카트번호
       snackCart.setUserId("hyojin");  //회원아이디
       snackCart.setSnackCount(2);  //스낵의 수량
       snackCart.setSnackNum(2);  //스낵번호(SnackVO참조)
       snackCart.setPaymentNum(100);  //결제번호(PaymentVO참조)
       
       snackCart = new SnackCartVO();
       snackCart.setSnackCartNum(3); //스낵카트번호
       snackCart.setUserId("kiwan");  //회원아이디
       snackCart.setSnackCount(2);  //스낵의 수량
       snackCart.setSnackNum(1);  //스낵번호(SnackVO참조)
       snackCart.setPaymentNum(-1);  //결제번호(PaymentVO참조)
    }
}












