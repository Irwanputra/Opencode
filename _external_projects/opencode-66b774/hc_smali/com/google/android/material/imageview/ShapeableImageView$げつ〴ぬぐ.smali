.class public Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;
.super Landroid/view/ViewOutlineProvider;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x15
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/imageview/ShapeableImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lcom/google/android/material/imageview/ShapeableImageView;

.field public final げつ〴ぬぐ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lcom/google/android/material/imageview/ShapeableImageView;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Rect;

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 4

    iget-object p1, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1
    iget-object v0, p1, Lcom/google/android/material/imageview/ShapeableImageView;->ぺふねづ〺:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/てぜきぽく;

    if-nez v0, :cond_7

    return-void

    .line 2
    :cond_7
    iget-object p1, p1, Lcom/google/android/material/imageview/ShapeableImageView;->づざかべべ:Landroid/graphics/RectF;

    .line 3
    iget-object v0, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/RectF;->round(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 4
    iget-object p1, p1, Lcom/google/android/material/imageview/ShapeableImageView;->へぬ〴づぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 5
    iget-object v0, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/graphics/Rect;

    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object p1, p0, Lcom/google/android/material/imageview/ShapeableImageView$げつ〴ぬぐ;->〺つふすそ:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 6
    iget-object p1, p1, Lcom/google/android/material/imageview/ShapeableImageView;->へぬ〴づぞ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    .line 7
    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->getOutline(Landroid/graphics/Outline;)V

    return-void
.end method
