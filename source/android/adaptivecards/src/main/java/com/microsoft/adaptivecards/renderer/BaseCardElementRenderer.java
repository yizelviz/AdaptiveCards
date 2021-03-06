package com.microsoft.adaptivecards.renderer;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.microsoft.adaptivecards.objectmodel.SeparationConfig;
import com.microsoft.adaptivecards.objectmodel.SeparationStyle;

/**
 * Created by bekao on 5/11/2017.
 */

public abstract class BaseCardElementRenderer implements IBaseCardElementRenderer
{
    protected static void setSeparationConfig(
            Context context,
            ViewGroup viewGroup,
            SeparationStyle separationStyle,
            SeparationConfig defaultSeparationConfig,
            SeparationConfig strongSeparationConfig,
            boolean horizontalLine)
    {
        if (separationStyle.swigValue() == SeparationStyle.None.swigValue())
        {
            return;
        }

        SeparationConfig separationConfig;
        if (separationStyle.swigValue() == SeparationStyle.Default.swigValue())
        {
            separationConfig = defaultSeparationConfig;
        }
        else if (separationStyle.swigValue() == SeparationStyle.Strong.swigValue())
        {
            separationConfig = strongSeparationConfig;
        }
        else
        {
            throw new IllegalArgumentException("Unknown separation style: " + separationStyle.toString());
        }

        View view = new ImageView(context);
        int lineThickness = (int) Math.min(separationConfig.getLineThickness(), Integer.MAX_VALUE);
        LinearLayout.LayoutParams params;
        if (lineThickness > 0)
        {
            view.setBackgroundColor(Color.parseColor(separationConfig.getLineColor()));
            params = new LinearLayout.LayoutParams(
                    horizontalLine ? LinearLayout.LayoutParams.MATCH_PARENT : lineThickness,
                    horizontalLine ? lineThickness : LinearLayout.LayoutParams.MATCH_PARENT);
        }
        else
        {
            params = new LinearLayout.LayoutParams(
                    horizontalLine ? LinearLayout.LayoutParams.MATCH_PARENT : LinearLayout.LayoutParams.WRAP_CONTENT,
                    horizontalLine ? LinearLayout.LayoutParams.WRAP_CONTENT : LinearLayout.LayoutParams.MATCH_PARENT);
        }
        params.setMargins(
                horizontalLine ? 0 : (int)separationConfig.getSpacing() /* left */,
                horizontalLine ? (int)separationConfig.getSpacing() : 0 /* top */,
                horizontalLine ? 0 : (int)separationConfig.getSpacing() /* right */,
                horizontalLine ? (int)separationConfig.getSpacing() : 0 /* bottom */);
        view.setLayoutParams(params);
        viewGroup.addView(view);
    }
}
