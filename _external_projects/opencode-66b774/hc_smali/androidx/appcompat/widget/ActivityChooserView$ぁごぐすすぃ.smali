.class public Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3041\u3054\u3050\u3059\u3059\u3043"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/ActivityChooserView;)V
    .registers 2

    iput-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 5

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView;->〳ぜぞぜべっ:Landroid/widget/FrameLayout;

    const/4 v2, 0x0

    if-eq p1, v1, :cond_17

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView;->なぎぱいぢぎ:Landroid/widget/FrameLayout;

    if-ne p1, v1, :cond_11

    iget p1, v0, Landroidx/appcompat/widget/ActivityChooserView;->ぇぬぎばつ:I

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/ActivityChooserView;->びぐびあび(I)V

    throw v2

    :cond_11
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :cond_17
    invoke-virtual {v0}, Landroidx/appcompat/widget/ActivityChooserView;->げつ〴ぬぐ()Z

    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    throw v2
.end method

.method public onDismiss()V
    .registers 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->おぐぴう〸ず:Landroid/widget/PopupWindow$OnDismissListener;

    if-eqz v0, :cond_9

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 2
    :cond_9
    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v0, v0, Landroidx/appcompat/widget/ActivityChooserView;->ぺふねづ〺:Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;

    if-eqz v0, :cond_13

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/〺つふすそ;->ぺぁあねじ(Z)V

    :cond_13
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object p1

    check-cast p1, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;->びぐびあび:Z

    const/4 p2, 0x0

    if-nez p1, :cond_1a

    .line 2
    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Landroidx/appcompat/widget/ActivityChooserView;->げつ〴ぬぐ()Z

    iget-object p1, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 3
    iget-boolean p1, p1, Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;->くし〴〺ぅ:Z

    .line 4
    throw p2

    .line 5
    :cond_1a
    throw p2
.end method

.method public onLongClick(Landroid/view/View;)Z
    .registers 4

    iget-object v0, p0, Landroidx/appcompat/widget/ActivityChooserView$ぁごぐすすぃ;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView;

    iget-object v1, v0, Landroidx/appcompat/widget/ActivityChooserView;->〳ぜぞぜべっ:Landroid/widget/FrameLayout;

    if-ne p1, v1, :cond_d

    iget-object p1, v0, Landroidx/appcompat/widget/ActivityChooserView;->〺つふすそ:Landroidx/appcompat/widget/ActivityChooserView$なぎぱいぢぎ;

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    throw p1

    .line 2
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
