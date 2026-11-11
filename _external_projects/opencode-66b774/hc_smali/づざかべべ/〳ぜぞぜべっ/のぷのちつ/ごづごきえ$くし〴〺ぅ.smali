.class public Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public 〺つふすそ:Z

.field public げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;


# direct methods
.method public constructor <init>(Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)V
    .registers 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ:I

    const/4 v1, -0x1

    const/4 v2, 0x0

    if-le v0, v1, :cond_f

    invoke-virtual {p1, v0, v2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iput v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ:I

    :cond_f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-ge v0, v1, :cond_19

    iget-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->〺つふすそ:Z

    if-nez v0, :cond_33

    :cond_19
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    if-eqz v1, :cond_2b

    move-object v2, v0

    check-cast v2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    :cond_2b
    if-eqz v2, :cond_30

    invoke-interface {v2, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;->〺つふすそ(Landroid/view/View;)V

    :cond_30
    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->〺つふすそ:Z

    :cond_33
    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)V
    .registers 5

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->〺つふすそ:Z

    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    iget v0, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;->〺つふすそ:I

    const/4 v1, 0x0

    const/4 v2, -0x1

    if-le v0, v2, :cond_f

    const/4 v0, 0x2

    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    :cond_f
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ$くし〴〺ぅ;->げつ〴ぬぐ:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ごづごきえ;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    if-eqz v2, :cond_21

    move-object v1, v0

    check-cast v1, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    :cond_21
    if-eqz v1, :cond_26

    invoke-interface {v1, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;->くし〴〺ぅ(Landroid/view/View;)V

    :cond_26
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 4

    const/high16 v0, 0x7e000000

    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    if-eqz v1, :cond_d

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;

    goto :goto_e

    :cond_d
    const/4 v0, 0x0

    :goto_e
    if-eqz v0, :cond_13

    invoke-interface {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ざっざへづ;->げつ〴ぬぐ(Landroid/view/View;)V

    :cond_13
    return-void
.end method
