package com.mystudy.scanner.Thisisjava.Example.ch15_Collection.sec02.example01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        // Array 컬렉션 생성 (객체 타입 = Board 클래스)
        List<Board> list = new ArrayList<>();

        // 객체 추가 (Board 클래스의 파라미터 입력)
        list.add(new Board("제목1", "내용1","글쓴이1"));
        list.add(new Board("제목2", "내용2","글쓴이2"));
        list.add(new Board("제목3", "내용3","글쓴이3"));
        list.add(new Board("제목4", "내용4","글쓴이4"));
        list.add(new Board("제목5", "내용5","글쓴이5"));

        // 저장된 총 객체 수 얻기
        int size = list.size();
        System.out.println("총 객체 수: "+size);
        System.out.println();

        // ArrayList[2] 객체 가져오기
        Board board = list.get(2);
        System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
        System.out.println();

        // ArrayList 모든 객체 가져오기
        for (int i=0; i<list.size(); i++){
            Board b = list.get(i);
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
        System.out.println();

        // ArrayList[2] 삭제 후, ArrayList[2]
        // 뒤에 오는 ArrayList[2]는 삭제 전 ArrayList[3]과 같다. (한 칸씩 땡겨짐)
        list.remove(2); // {제목3, 내용3, 글쓴이3} 객체 삭제
        list.remove(2); // {제목4, 내용4, 글쓴이4} 삭제

        // 삭제후 ArrayList 모든 객체 가져오기
        for (Board b : list){
            System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
        }
    }
}
