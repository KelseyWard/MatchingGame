// Generated by view binder compiler. Do not edit!
package com.zybooks.matchinggame.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.zybooks.matchinggame.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChooseLevelBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button easyLevel;

  @NonNull
  public final Button hardLevel;

  @NonNull
  public final TextView levelTitle;

  @NonNull
  public final Button mediumLevel;

  @NonNull
  public final Button menuButton;

  @NonNull
  public final ConstraintLayout relativeLayout;

  private ActivityChooseLevelBinding(@NonNull ConstraintLayout rootView, @NonNull Button easyLevel,
      @NonNull Button hardLevel, @NonNull TextView levelTitle, @NonNull Button mediumLevel,
      @NonNull Button menuButton, @NonNull ConstraintLayout relativeLayout) {
    this.rootView = rootView;
    this.easyLevel = easyLevel;
    this.hardLevel = hardLevel;
    this.levelTitle = levelTitle;
    this.mediumLevel = mediumLevel;
    this.menuButton = menuButton;
    this.relativeLayout = relativeLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChooseLevelBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChooseLevelBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_choose_level, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChooseLevelBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.easyLevel;
      Button easyLevel = ViewBindings.findChildViewById(rootView, id);
      if (easyLevel == null) {
        break missingId;
      }

      id = R.id.hardLevel;
      Button hardLevel = ViewBindings.findChildViewById(rootView, id);
      if (hardLevel == null) {
        break missingId;
      }

      id = R.id.levelTitle;
      TextView levelTitle = ViewBindings.findChildViewById(rootView, id);
      if (levelTitle == null) {
        break missingId;
      }

      id = R.id.mediumLevel;
      Button mediumLevel = ViewBindings.findChildViewById(rootView, id);
      if (mediumLevel == null) {
        break missingId;
      }

      id = R.id.menuButton;
      Button menuButton = ViewBindings.findChildViewById(rootView, id);
      if (menuButton == null) {
        break missingId;
      }

      ConstraintLayout relativeLayout = (ConstraintLayout) rootView;

      return new ActivityChooseLevelBinding((ConstraintLayout) rootView, easyLevel, hardLevel,
          levelTitle, mediumLevel, menuButton, relativeLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
