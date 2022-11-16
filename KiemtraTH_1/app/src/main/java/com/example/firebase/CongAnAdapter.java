package com.example.firebase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CongAnAdapter extends RecyclerView.Adapter<CongAnAdapter.CongAnViewHolder> {
    private List<CongAn> congAns;
    private Context context;

    public void SetData(List<CongAn> congAns) {
        this.congAns = congAns;
        notifyDataSetChanged();
    }

    public CongAnAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public CongAnViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.congan, parent, false);

        return new CongAnViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CongAnViewHolder holder, int position) {
        CongAn item = congAns.get(position);
        if (congAns==null){
            return;
        }
        holder.tv_name.setText(item.getTen());
        holder.tv_CapBac.setText(item.getCapbac());
        holder.tv_NoiCongTac.setText(item.getNoiCongTac());
        holder.tv_SoSao.setText(item.getQuocGia());
        holder.tvimages.setImageResource(item.getAnh());
    }

    @Override
    public int getItemCount() {
        return congAns == null ? 0 : congAns.size();
    }

    public class CongAnViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_name,tv_CapBac,tv_NoiCongTac,tv_SoSao;
        private ImageView tvimages;
        public CongAnViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.tv_NameCa);
            tv_CapBac = (TextView) itemView.findViewById(R.id.tv_CapBacCa);
            tv_NoiCongTac = (TextView) itemView.findViewById(R.id.tv_CongTacCa);
            tv_SoSao = (TextView) itemView.findViewById(R.id.tv_SoSao);
            tvimages = (ImageView) itemView.findViewById(R.id.ImagesCA);
        }
    }
}
