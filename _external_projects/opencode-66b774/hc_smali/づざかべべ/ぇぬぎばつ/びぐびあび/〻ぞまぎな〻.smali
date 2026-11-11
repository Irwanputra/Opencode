.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public final づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

.field public final びぐびあび:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    .line 1
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    if-eqz p1, :cond_a

    goto :goto_f

    .line 2
    :cond_a
    new-instance p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;)V

    :goto_f
    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->づざかべべ:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 6

    invoke-super {p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/4 p1, 0x1

    return p1

    :cond_8
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->いいにぽつ()Z

    move-result p1

    if-nez p1, :cond_27

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    if-eqz p1, :cond_27

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    .line 1
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {p1, v1, v0, p2, p3}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->いたぷすいだ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;ILandroid/os/Bundle;)Z

    move-result p1

    return p1

    :cond_27
    const/4 p1, 0x0

    return p1
.end method

.method public いいにぽつ()Z
    .registers 2

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->ぇとしたべど()Z

    move-result v0

    return v0
.end method

.method public くし〴〺ぅ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    instance-of v0, p1, Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v0, :cond_1e

    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->いいにぽつ()Z

    move-result v0

    if-nez v0, :cond_1e

    check-cast p1, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    if-eqz v0, :cond_1e

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->のびぶけせ(Landroid/view/accessibility/AccessibilityEvent;)V

    :cond_1e
    return-void
.end method

.method public びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 5

    .line 1
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    iget-object v1, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 3
    invoke-virtual {v0, p1, v1}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    .line 4
    invoke-virtual {p0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->いいにぽつ()Z

    move-result p1

    if-nez p1, :cond_24

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    if-eqz p1, :cond_24

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    .line 5
    iget-object v0, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    invoke-virtual {p1, v1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->びちづぼぬ(Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    :cond_24
    return-void
.end method
