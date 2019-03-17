package com.example.quahjingwen.sharenus;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.InputStream;
import java.util.ArrayList;

public class ImageUploadAdaptor extends ArrayAdapter<ImageUploadInfo> {
    public ImageUploadAdaptor(Context context, ArrayList<ImageUploadInfo> info) {
        super(context, 0, info);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        ImageUploadInfo image = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_imageupload, parent, false);
        }
        // Lookup view for data population
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView3);
        TextView tvUsername = (TextView) convertView.findViewById(R.id.tvUsername);
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvFaculty = (TextView) convertView.findViewById(R.id.tvFaculty);
        TextView tvCourse = (TextView) convertView.findViewById(R.id.tvCourse);
        TextView tvModule = (TextView) convertView.findViewById(R.id.tvModule);
        TextView tvDescription = (TextView) convertView.findViewById(R.id.tvDescription);
        Button clickChat = (Button) convertView.findViewById(R.id.click2chat);

        // Populate the data into the template view using the data object
        tvUsername.setText(image.getUsername());
        tvName.setText(image.getImageName());
        tvFaculty.setText(image.geteFaculty());
        tvCourse.setText(image.geteCourse());
        tvModule.setText(image.geteModuleCode());
        tvDescription.setText(image.geteDescription());

        new DownloadImageTask((ImageView) convertView.findViewById(R.id.imageView3)).execute(image.getImageURL());

        // Return the completed view to render on screen
        return convertView;

    }

    protected class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {
            bmImage.setImageBitmap(result);
        }
    }
}