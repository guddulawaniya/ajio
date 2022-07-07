package com.example.ajio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class productsAdapter extends RecyclerView.Adapter<productsAdapter.viewholder> {

    ArrayList<Models> list;
    Context context;

    public productsAdapter(ArrayList<Models> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.products_items,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {
        Models models = list.get(position);
        holder.image.setImageResource(models.getProductimage());
        holder.productname.setText(models.getProductname());
        holder.producttitle.setText(models.getProducttitle());
        holder.discount.setText(models.getDiscount());
        holder.bestprice.setText(models.getBestprice());
        holder.price.setText(models.getPrice());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, product_activity_details.class);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView productname,producttitle,bestprice,price,discount;
        ImageView image;
        public viewholder(@NonNull View itemView) {
            super(itemView);
            productname = itemView.findViewById(R.id.productname);
            producttitle = itemView.findViewById(R.id.producttitle);
            bestprice = itemView.findViewById(R.id.bestprice);
            price = itemView.findViewById(R.id.product_price);
            discount = itemView.findViewById(R.id.discount);
            image = itemView.findViewById(R.id.productimage);

        }
    }
}
