package com.axtech.xiaomeiedit.xiaomeiedit.activity.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.axtech.xiaomeiedit.xiaomeiedit.R;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareBean;
import com.axtech.xiaomeiedit.xiaomeiedit.activity.bean.WareDetailBean;
import com.axtech.xiaomeiedit.xiaomeiedit.api.Api;
import com.axtech.xiaomeiedit.xiaomeiedit.api.ApiUtil;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseActivity;
import com.axtech.xiaomeiedit.xiaomeiedit.base.BaseBean;
import com.axtech.xiaomeiedit.xiaomeiedit.reyclerViewTouchMove.ItemTouchHelperAdapter;
import com.axtech.xiaomeiedit.xiaomeiedit.reyclerViewTouchMove.SimpleItemTouchHelperCallback;
import com.axtech.xiaomeiedit.xiaomeiedit.utils.Utils;
import com.bm.library.Info;
import com.bm.library.PhotoView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;

public class WareDetailActivity extends BaseActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.back)
    ImageView back;
    @BindView(R.id.wareInfo)
    LinearLayout wareInfo;
    @BindView(R.id.releaseButton)
    Button releaseButton;

    private List<WareDetailBean.RowsBean.ImageBean> imgdata = new ArrayList<>();
    private List<WareDetailBean.RowsBean.ImageBean> imgDeleteData = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_waredetail);

        final WareBean wareBean = (WareBean) getIntent().getSerializableExtra("wareBean");


        final RecyclerAdapter adapter = new RecyclerAdapter();
        recyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        //创建SimpleItemTouchHelperCallback
        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(adapter);
        //用Callback构造ItemtouchHelper
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        //调用ItemTouchHelper的attachToRecyclerView方法建立联系
        touchHelper.attachToRecyclerView(recyclerView);

        releaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, String> map = new HashMap<>();
                map.put("access-token", Utils.getSharePerference("token"));
                map.put("storageId", wareBean.getRows().get(0).getStorageId());
                map.put("mainImageId", imgdata.get(0).getId());
                map.put("status", "ON");
                String imageIds = "";
                for (int i = 1; i < imgdata.size(); i++) {
                    if (i == 1)
                        imageIds = imgdata.get(i).getId();
                    else
                        imageIds = imageIds + ',' + imgdata.get(i).getId();
                }
                map.put("detailImageIds", imageIds);
                Api.request(WareDetailActivity.this, Api.getServerApi().changeImageIndex(map), new ApiUtil.HttpCallBack<BaseBean>() {
                    @Override
                    public void callBack(BaseBean baseBean) {
                        if (baseBean.getStatus() == 200 && Utils.requestingNumber == 1) {
                            Utils.showToast(WareDetailActivity.this, "发布成功");
                            finish();
                        }
                    }
                });


                for (int i = 0; i < imgDeleteData.size(); i++) {
                    Api.request(WareDetailActivity.this,
                            Api.getServerApi().deleteImage(imgDeleteData.get(i).getId(), Utils.getSharePerference("token")),
                            new ApiUtil.HttpCallBack<BaseBean>() {
                                @Override
                                public void callBack(BaseBean baseBean) {
                                    if (baseBean.getStatus() == 200 && Utils.requestingNumber == 1) {
                                        Utils.showToast(WareDetailActivity.this, "发布成功");
                                        finish();
                                    }
                                }
                            });
                }

            }
        });


        Api.request(this,
                Api.getServerApi().getWareDetail(wareBean.getSerial(), Utils.getSharePerference("token")),
                new ApiUtil.HttpCallBack<WareDetailBean>() {
                    @Override
                    public void callBack(WareDetailBean wareDetailBean) {

                        setWareInfo(wareDetailBean);

                        setImageData(wareDetailBean);
                        adapter.notifyDataSetChanged();
                    }
                });


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }


    public void setWareInfo(WareDetailBean wareDetailBean) {
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 45, getResources().getDisplayMetrics()));
        int paddingLeft = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, 20, getResources().getDisplayMetrics());

        LinearLayout.LayoutParams lineParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 1);
        lineParams.setMargins(paddingLeft, 0, 0, 0);

        LinearLayout linearLayout = new LinearLayout(WareDetailActivity.this);
        TextView keyView = new TextView(WareDetailActivity.this);
        keyView.setText("品牌");
        keyView.setLayoutParams(params);
        keyView.setPadding(paddingLeft, 0, 0, 0);
        keyView.setGravity(Gravity.CENTER);
        keyView.setTextColor(Color.parseColor("#4a4a4a"));
        TextView valueView = new TextView(WareDetailActivity.this);
        valueView.setText(wareDetailBean.getRows().get(0).getStorageView().getStorage().getMerchantName());
        valueView.setLayoutParams(params);
        valueView.setPadding(paddingLeft, 0, 0, 0);
        valueView.setGravity(Gravity.CENTER);
        valueView.setTextColor(Color.parseColor("#9b9b9b"));
        linearLayout.addView(keyView);
        linearLayout.addView(valueView);
        wareInfo.addView(linearLayout);
        TextView lineView = new TextView(WareDetailActivity.this);
        lineView.setBackgroundColor(Color.parseColor("#CDCDCD"));
        lineView.setLayoutParams(lineParams);
        wareInfo.addView(lineView);

        LinearLayout linearLayout2 = new LinearLayout(WareDetailActivity.this);
        TextView keyView2 = new TextView(WareDetailActivity.this);
        keyView2.setText("品类");
        keyView2.setLayoutParams(params);
        keyView2.setPadding(paddingLeft, 0, 0, 0);
        keyView2.setGravity(Gravity.CENTER);
        keyView2.setTextColor(Color.parseColor("#4a4a4a"));
        TextView valueView2 = new TextView(WareDetailActivity.this);
        valueView2.setText(wareDetailBean.getRows().get(0).getStorageView().getStorage().getCategoryName());
        valueView2.setLayoutParams(params);
        valueView2.setPadding(paddingLeft, 0, 0, 0);
        valueView2.setGravity(Gravity.CENTER);
        valueView2.setTextColor(Color.parseColor("#9b9b9b"));
        linearLayout2.addView(keyView2);
        linearLayout2.addView(valueView2);
        wareInfo.addView(linearLayout2);
        TextView lineView2 = new TextView(WareDetailActivity.this);
        lineView2.setBackgroundColor(Color.parseColor("#CDCDCD"));
        lineView2.setLayoutParams(lineParams);
        wareInfo.addView(lineView2);

        LinearLayout linearLayout1 = new LinearLayout(WareDetailActivity.this);
        TextView keyView1 = new TextView(WareDetailActivity.this);
        keyView1.setText("材质");
        keyView1.setLayoutParams(params);
        keyView1.setPadding(paddingLeft, 0, 0, 0);
        keyView1.setGravity(Gravity.CENTER);
        keyView1.setTextColor(Color.parseColor("#4a4a4a"));
        TextView valueView1 = new TextView(WareDetailActivity.this);
        valueView1.setText(wareDetailBean.getRows().get(0).getStorageView().getStorage().getMetalName());
        valueView1.setLayoutParams(params);
        valueView1.setPadding(paddingLeft, 0, 0, 0);
        valueView1.setGravity(Gravity.CENTER);
        valueView1.setTextColor(Color.parseColor("#9b9b9b"));
        linearLayout1.addView(keyView1);
        linearLayout1.addView(valueView1);
        wareInfo.addView(linearLayout1);
//        TextView lineView1 = new TextView(WareDetailActivity.this);
//        lineView1.setBackgroundColor(Color.parseColor("#CDCDCD"));
//        lineView1.setLayoutParams(lineParams);
//        wareInfo.addView(lineView1);


    }

    public void setImageData(WareDetailBean wareDetailBean) {
        imgdata.add(wareDetailBean.getRows().get(0).getMainImage());
        for (int i = 0; i < wareDetailBean.getRows().get(0).getDetailImages().size(); i++) {
            imgdata.add(wareDetailBean.getRows().get(0).getDetailImages().get(i));
        }

    }

    /**
     * 拖拽效果
     */
    public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements ItemTouchHelperAdapter {
        @Override
        public void onItemMove(RecyclerView.ViewHolder source, RecyclerView.ViewHolder target) {
            int fromPosition = source.getAdapterPosition();
            int toPosition = target.getAdapterPosition();
            System.out.println(fromPosition);
            System.out.println(toPosition);
            if (fromPosition < imgdata.size() && toPosition < imgdata.size()) {
                //交换数据位置
//                Collections.swap(imgdata, fromPosition, toPosition);
                if (fromPosition > toPosition) {
                    imgdata.add(toPosition, imgdata.get(fromPosition));
                    imgdata.remove(fromPosition + 1);
                } else {
                    imgdata.add(toPosition + 1, imgdata.get(fromPosition));
                    imgdata.remove(fromPosition);
                }
                //刷新位置交换
                notifyItemMoved(fromPosition, toPosition);
            }
            //移动过程中移除view的放大效果
            onItemClear(source);
        }

        @Override
        public void onItemDissmiss(RecyclerView.ViewHolder source) {
            final int position = source.getAdapterPosition();
            imgDeleteData.add(imgdata.get(position));
            imgdata.remove(position); //移除数据
            notifyItemRemoved(position);//刷新数据移除
        }

        @Override
        public void onItemSelect(RecyclerView.ViewHolder source) {
            //当拖拽选中时放大选中的view
            source.itemView.setScaleX(1.2f);
            source.itemView.setScaleY(1.2f);
        }

        @Override
        public void onItemClear(RecyclerView.ViewHolder source) {
            //拖拽结束后恢复view的状态
            source.itemView.setScaleX(1.0f);
            source.itemView.setScaleY(1.0f);
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            ImageView iv;
            ImageView closeImg;

            public ViewHolder(View itemView) {
                super(itemView);
                iv = itemView.findViewById(R.id.iv);
                closeImg = itemView.findViewById(R.id.closeImg);
            }
        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(WareDetailActivity.this).inflate(R.layout.activity_waredetail_adapter_img, null);
            ViewHolder holder = new ViewHolder(view);
            return holder;
        }

        @Override
        public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
            holder.iv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(WareDetailActivity.this, ImageBrowseActivity.class);
                    intent.putExtra(ImageBrowseActivity.INTENT_IMAGE_URL, Utils.getFileServerPath() + imgdata.get(position).getPath());
                    WareDetailActivity.this.startActivity(intent);
                }
            });
            Utils.getPicasso().with(WareDetailActivity.this).load(Utils.getFileServerPath() + imgdata.get(position).getPath()).placeholder(R.mipmap.img_ware_loading).resize(240, 240).into(holder.iv);
            holder.closeImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemDissmiss(holder);
                }
            });
        }

        @Override
        public int getItemCount() {
            return imgdata == null ? 0 : imgdata.size();
        }
    }
}
