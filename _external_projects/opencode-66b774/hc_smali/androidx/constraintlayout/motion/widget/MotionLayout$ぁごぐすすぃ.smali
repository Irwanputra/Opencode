.class public Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/constraintlayout/motion/widget/MotionLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public 〺つふすそ:F

.field public くし〴〺ぅ:I

.field public げつ〴ぬぐ:F

.field public final synthetic づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

.field public びぐびあび:I


# direct methods
.method public constructor <init>(Landroidx/constraintlayout/motion/widget/MotionLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/high16 p1, 0x7fc00000    # Float.NaN

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->〺つふすそ:F

    const/4 p1, -0x1

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->くし〴〺ぅ:I

    iput p1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->びぐびあび:I

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ()V
    .registers 5

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->くし〴〺ぅ:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->びぐびあび:I

    if-eq v2, v1, :cond_29

    :cond_9
    if-ne v0, v1, :cond_13

    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->びぐびあび:I

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->なぶひせが(I)V

    goto :goto_22

    :cond_13
    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->びぐびあび:I

    if-ne v2, v1, :cond_1d

    iget-object v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v2, v0, v1, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(III)V

    goto :goto_22

    :cond_1d
    iget-object v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    invoke-virtual {v3, v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setTransition(II)V

    :goto_22
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    sget-object v2, Landroidx/constraintlayout/motion/widget/MotionLayout$ぺぁあねじ;->くし〴〺ぅ:Landroidx/constraintlayout/motion/widget/MotionLayout$ぺぁあねじ;

    invoke-virtual {v0, v2}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setState(Landroidx/constraintlayout/motion/widget/MotionLayout$ぺぁあねじ;)V

    :cond_29
    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->〺つふすそ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_42

    iget v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->げつ〴ぬぐ:F

    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    if-eqz v0, :cond_3a

    return-void

    :cond_3a
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->げつ〴ぬぐ:F

    invoke-virtual {v0, v1}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(F)V

    return-void

    :cond_42
    iget-object v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->づざかべべ:Landroidx/constraintlayout/motion/widget/MotionLayout;

    iget v2, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->げつ〴ぬぐ:F

    iget v3, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->〺つふすそ:F

    invoke-virtual {v0, v2, v3}, Landroidx/constraintlayout/motion/widget/MotionLayout;->setProgress(FF)V

    const/high16 v0, 0x7fc00000    # Float.NaN

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->げつ〴ぬぐ:F

    iput v0, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->〺つふすそ:F

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->くし〴〺ぅ:I

    iput v1, p0, Landroidx/constraintlayout/motion/widget/MotionLayout$ぁごぐすすぃ;->びぐびあび:I

    return-void
.end method
