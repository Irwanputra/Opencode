.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/いいにぽつ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# instance fields
.field public final synthetic 〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/いいにぽつ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/いいにぽつ;->〺つふすそ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;->ぉ〲なぱぽた:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    invoke-virtual {v1}, Landroid/widget/ImageButton;->getRotation()F

    move-result v1

    iget v2, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;->ざとぅぼこ〺:F

    cmpl-float v2, v2, v1

    if-eqz v2, :cond_13

    iput v1, v0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;->ざとぅぼこ〺:F

    invoke-virtual {v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/びえぁぜい/〳ぜぞぜべっ;->ぶでにく〼〳()V

    :cond_13
    const/4 v0, 0x1

    return v0
.end method
