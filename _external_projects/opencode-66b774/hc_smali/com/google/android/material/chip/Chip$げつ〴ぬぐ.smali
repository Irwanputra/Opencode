.class public Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/material/chip/Chip;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;


# direct methods
.method public constructor <init>(Lcom/google/android/material/chip/Chip;)V
    .registers 2

    iput-object p1, p0, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    invoke-direct {p0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぅみぱぎぎ/びぐびあび;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/graphics/Typeface;Z)V
    .registers 4

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    .line 1
    iget-object p2, p1, Lcom/google/android/material/chip/Chip;->づざかべべ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;

    .line 2
    iget-boolean v0, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ひぞ〴つき:Z

    if-eqz v0, :cond_b

    .line 3
    iget-object p2, p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/でどあくず/〺つふすそ;->ぉひのべい:Ljava/lang/CharSequence;

    goto :goto_f

    .line 4
    :cond_b
    invoke-virtual {p1}, Landroid/widget/CheckBox;->getText()Ljava/lang/CharSequence;

    move-result-object p2

    :goto_f
    invoke-virtual {p1, p2}, Landroid/widget/CheckBox;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->requestLayout()V

    iget-object p1, p0, Lcom/google/android/material/chip/Chip$げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/chip/Chip;

    invoke-virtual {p1}, Landroid/widget/CheckBox;->invalidate()V

    return-void
.end method

.method public げつ〴ぬぐ(I)V
    .registers 2

    return-void
.end method
