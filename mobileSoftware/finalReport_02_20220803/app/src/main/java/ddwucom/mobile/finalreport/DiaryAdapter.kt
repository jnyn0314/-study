package ddwucom.mobile.finalreport

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ddwucom.mobile.finalreport.data.DiaryDBHelper
import ddwucom.mobile.finalreport.data.DiaryDto
import ddwucom.mobile.finalreport.databinding.ListItemBinding

class DiaryAdapter (val diary : ArrayList<DiaryDto>)
    : RecyclerView.Adapter<DiaryAdapter.DiaryViewHolder>() {
    val TAG = "DiaryAdapter"

    /*재정의 필수 - 데이터의 개수 확인이 필요할 때 호출*/
    override fun getItemCount(): Int = diary.size

    /*재정의 필수 - 각 item view 의 view holder 생성 시 호출*/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DiaryViewHolder {
        val itemBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DiaryViewHolder(itemBinding)
    }

    /*재정의 필수 - 각 item view 의 항목에 데이터 결합 시 호출*/
    override fun onBindViewHolder(holder: DiaryViewHolder, position: Int) {
        holder.itemBinding.tvTitle.text = diary[position].toString()
    }

    inner class DiaryViewHolder(val itemBinding: ListItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root) {
        init {
            /*RecyclerView 항목 클릭 시 외부 click 이벤트 리스너 호출*/
            itemBinding.root.setOnClickListener{
                listener?.onItemClick(it, adapterPosition)  // RecyclerView 항목 클릭 시 외부에서 지정한 리스너 호출
                Log.d(TAG, diary[adapterPosition].toString())
            }
        }
    }
    /*사용자 정의 외부 click 이벤트 리스너 설정 */
    var listener : OnItemClickListener? = null  // listener 를 사용하지 않을 때도 있으므로 null

    interface OnItemClickListener {
        fun onItemClick(view : View, position : Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener?) {
        this.listener = listener
    }
}