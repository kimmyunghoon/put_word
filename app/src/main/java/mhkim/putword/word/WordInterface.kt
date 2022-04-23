package mhkim.putword.word

import mhkim.putword.common.WordLocation
/**
 *  글자를 캔버스에 세팅하기 위한 조건
 *  1. 기기별 화면 크기 입력
 *  2. 화면에 들어갈 글자 수
 *  3. 글자의 화면 좌표 설정
 *  4. 캔버스에 drawing
 */
interface WordInterface {
     var word_type : String
    var words_info : ArrayList<WordLocation>
}