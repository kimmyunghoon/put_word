package mhkim.putword.word

import mhkim.putword.common.WordLocation


//Todo params 로 화면에 대한 정보 받아서 해당 클래스에 저장해놓을것(초기 1회만 실행)
class KoreanWord ( ) : WordInterface {
    override var word_type: String
        get() = word_type
        set(new_word_type) {
            word_type = new_word_type
        }

    //Todo : canvas 에서 해당 정보를 가져다가 사용할 것
    override var words_info: ArrayList<WordLocation>

        get() = words_info
        set(value) {
            words_info = initWords(word_type)
        }

    private fun initWords(word_type: String) : ArrayList<WordLocation>{
        //Todo : Word location 랜덤 초기화
        // params 초기화 할때 필요한 정보 받기
        // 초기화 알고리즘 구현할것
        return ArrayList()
    }

}