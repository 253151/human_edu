package EmployeeManagement02;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

// 일일 근무시간을 계속 입력하여 더해주는 기능 만들기.
// 한달은 31일 이하이므로 31개 이하로만 입력하거나 달마다 다른 제한 적용되도록.
public class EmployeeManagement implements Store {
	ArrayList<StoreEmployee> arr = new ArrayList<>();
	Scanner sc = new Scanner (System.in);

	@Override
	public void saveWorker() {
		// TODO Auto-generated method stub
		String name;
		String jobRank = null;
		String joinDay;
		int workTime = 0;
		StoreEmployee se = new StoreEmployee();
		System.out.print("사원 이름 : ");
		name = sc.next();
		System.out.print("입사일 : ");
		sc.nextLine();
		joinDay = sc.nextLine();
		System.out.print("일일 근무시간 : ");
		workTime = sc.nextInt();
        se.setName(name);
        se.setJobRank(jobRank);
        se.setJoinDay(joinDay);
        se.setWorkTime(workTime);
        arr.add(se);
        System.out.println("직원 등록이 완료되었습니다.");
        
		
	}

	@Override
	public void modify() {
		// TODO Auto-generated method stub
		System.out.print("수정할 직원의 이름을 입력하세요 > ");
		String mName = sc.next();
		boolean mN = true;
		for (int i=0; i <= arr.size(); i++) {
			mN = false;
			System.out.print("변경된 일일 근무시간 입력 : ");
			int mWorkTime = sc.nextInt();
			arr.get(i).setWorkTime(mWorkTime);
			System.out.println("일일 근무시간 수정이 완료되었습니다.");
			break;
			
		}
		
	}

	@Override
	public void search() {
		// TODO Auto-generated method stub
        System.out.print("검색할 사원의 이름을 입력하세요 : ");
        String yourName = sc.next();
        boolean flag = true;
        for (int i = 0 ; i < arr.size(); i++) {
            if (arr.get(i).getName().equals(yourName)) {
                flag = false;
                System.out.println("이름 : "+arr.get(i).getName());
                System.out.println("입사일 : "+arr.get(i).getJoinDay());
                try {
					System.out.println("직급 : "+arr.get(i).getJobRank());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println("월급 : "+arr.get(i).getMonthSalary());
                break;
            }
        }
        if (flag) {
            System.out.println("해당 사원이 없습니다.");
        }
		
	}

	@Override
	public void outputTitle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void output() {
		// TODO Auto-generated method stub
		 System.out.println("============ 사원 정보 출력 ============");
	        System.out.println("---------------------------------");
	        System.out.println("| 이름  | 직급 |   월급    | 적용시급 |");
	        System.out.println("---------------------------------");
	        for(int i = 0 ; i < arr.size(); i++) {
	            try {
					System.out.println("|"+arr.get(i).getName()+"| "+arr.get(i).getJobRank()
					        +" | "+arr.get(i).getMonthSalary()+" | "+arr.get(i).getHourlyWage());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
		
	}

}
