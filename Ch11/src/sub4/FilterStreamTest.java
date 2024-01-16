package sub4;

import java.util.Collections;
import java.util.List;

/*
 * 날짜 : 2024/01/16
 * 이름 : 김형민
 * 내용 : Java 컬렉션 스트림 필터 실습하기
 */
public class FilterStreamTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,1,2,3); //데이터 바로 넣기
		System.out.println(numbers);
		
		// 중복제거 distinct
		numbers
		.stream()
		.distinct()
		.forEach(num -> System.out.print(num + ", "));
		System.out.println();
		// 5이상 데이터만 필터링
		
		numbers
			.stream()
			.filter(num -> num >=5)
			.forEach(num ->System.out.print(num + ", "));
			System.out.println();
			
		//중복제거하고 ,짝수 데이터 필터링,내림차순 정렬
		
		numbers
			.stream()
			.distinct()
			.filter(num1 -> num1 %2 == 0)
			.sorted(Collections.reverseOrder()) // 내림차순 
			.forEach(num1 -> System.out.println(num1 + ", "));
		
	}
}
