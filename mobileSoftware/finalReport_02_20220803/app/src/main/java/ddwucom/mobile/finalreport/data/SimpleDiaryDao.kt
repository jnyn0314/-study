package ddwucom.mobile.finalreport.data

class SimpleDiaryDao {
    val diaryLists = ArrayList<DiaryDto>()
    init{
        diaryLists.add(DiaryDto(1, "e", "1", 1, "23"))
        diaryLists.add(DiaryDto(1, "e", "1", 2, "23"))
        diaryLists.add(DiaryDto(1, "e", "1", 3, "23"))
        diaryLists.add(DiaryDto(1, "e", "1", 4, "23"))
        diaryLists.add(DiaryDto(1, "e", "1", 5, "23"))
    }
    fun getAllDiarys() : ArrayList<DiaryDto>{
        return diaryLists
    }
    fun addNewDiary(newDiaryDto: ArrayList<DiaryDto>){
        diaryLists.addAll(newDiaryDto)
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