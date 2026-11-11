.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/げつ〴ぬぐ;
.super Landroid/view/ViewOutlineProvider;
.source ""


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/Chip;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    invoke-direct {p0}, Landroid/view/ViewOutlineProvider;-><init>()V

    return-void
.end method


# virtual methods
.method public getOutline(Landroid/view/View;Landroid/graphics/Outline;)V
    .registers 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x15
    .end annotation

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    .line 1
    iget-object p1, p1, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    if-eqz p1, :cond_a

    .line 2
    invoke-virtual {p1, p2}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->getOutline(Landroid/graphics/Outline;)V

    goto :goto_e

    :cond_a
    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Landroid/graphics/Outline;->setAlpha(F)V

    :goto_e
    return-void
.end method
