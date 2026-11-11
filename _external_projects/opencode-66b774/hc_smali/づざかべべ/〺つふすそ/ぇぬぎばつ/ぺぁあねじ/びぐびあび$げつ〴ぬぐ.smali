.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalLayout()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->〺つふすそ()Z

    move-result v0

    if-eqz v0, :cond_4f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->いいにぽつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_4f

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->いいにぽつ:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$びぐびあび;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/MenuPopupWindow;

    .line 1
    iget-boolean v0, v0, Landroidx/appcompat/widget/ListPopupWindow;->ぇ〳〲〺すっ:Z

    if-nez v0, :cond_4f

    .line 2
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->ぉざぅち〻:Landroid/view/View;

    if-eqz v0, :cond_4a

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v0

    if-nez v0, :cond_30

    goto :goto_4a

    :cond_30
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->いいにぽつ:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_38
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$びぐびあび;

    iget-object v1, v1, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$びぐびあび;->げつ〴ぬぐ:Landroidx/appcompat/widget/MenuPopupWindow;

    invoke-virtual {v1}, Landroidx/appcompat/widget/ListPopupWindow;->show()V

    goto :goto_38

    :cond_4a
    :goto_4a
    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;

    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/びぐびあび;->dismiss()V

    :cond_4f
    return-void
.end method
