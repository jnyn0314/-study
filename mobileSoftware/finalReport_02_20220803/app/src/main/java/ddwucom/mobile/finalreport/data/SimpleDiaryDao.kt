package ddwucom.mobile.finalreport.data

import ddwucom.mobile.finalreport.R

class SimpleDiaryDao {
    val diaryLists = ArrayList<DiaryDto>()
    init{
        diaryLists.add(DiaryDto(1, R.drawable.boring, "오늘의 일기","2024-06-17", "좋음", "내용~~~"))
        diaryLists.add(DiaryDto(2, R.drawable.lovely, "오늘의일기2","2024-06-17", "lovely day", "내용 하하"))
        diaryLists.add(DiaryDto(3, R.drawable.sleepy, "일기3","2024-06-18", "so sleepy", "하기 싫다"))
        diaryLists.add(DiaryDto(4, R.drawable.happy, "일기4","2024-06-18", "6월 정산", "이거 다 끝낼 수 있을까?"))
        diaryLists.add(DiaryDto(5, R.drawable.romance, "일기5","2024-06-18", "좋아!", "ㅎㅎ.."))
    }
    fun getAllDiarys() : ArrayList<DiaryDto>{
        return diaryLists
    }
    fun addNewDiary(newDiaryDto: DiaryDto){
        diaryLists.add(newDiaryDto)
    }
    fun modifyDiary(pos : Int, modifyDiaryDto: DiaryDto){
        diaryLists.set(pos, modifyDiaryDto)
    }
    fun removeDiary(removeDiaryDto: DiaryDto){
        val index = diaryLists.indexOf(removeDiaryDto)
        diaryLists.removeAt(index)
    }
    fun getDiaryByPos(pos : Int) = diaryLists.get(pos)
}