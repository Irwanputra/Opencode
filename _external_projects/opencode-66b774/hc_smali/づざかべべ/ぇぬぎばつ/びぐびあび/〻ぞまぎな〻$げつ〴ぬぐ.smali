.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;
.super Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public づざかべべ:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Landroid/view/View;",
            "L\u3065\u3056\u304b\u3079\u3079/\u3033\u305c\u305e\u305c\u3079\u3063/\u306e\u3077\u306e\u3061\u3064/\u3052\u3064\u3034\u306c\u3050;",
            ">;"
        }
    .end annotation
.end field

.field public final びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;)V
    .registers 3

    invoke-direct {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;-><init>()V

    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;I)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〳ぜぞぜべっ(Landroid/view/View;I)V

    goto :goto_13

    .line 1
    :cond_e
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEvent(Landroid/view/View;I)V

    :goto_13
    return-void
.end method

.method public 〺つふすそ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;
    .registers 3

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;

    move-result-object p1

    return-object p1

    :cond_f
    invoke-super {p0, p1}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->〺つふすそ(Landroid/view/View;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/くし〴〺ぅ;

    move-result-object p1

    return-object p1
.end method

.method public ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z
    .registers 6

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->いいにぽつ()Z

    move-result v0

    if-nez v0, :cond_3c

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    if-eqz v0, :cond_3c

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    const/4 v1, 0x1

    if-eqz v0, :cond_24

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_2b

    return v1

    :cond_24
    invoke-super {p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    if-eqz p1, :cond_2b

    return v1

    :cond_2b
    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    iget-object p1, p1, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object p1

    .line 1
    iget-object p2, p1, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object p2, p2, Landroidx/recyclerview/widget/RecyclerView;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$ざとぅぼこ〺;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->〺えなひあ()Z

    move-result p1

    return p1

    .line 2
    :cond_3c
    invoke-super {p0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぁごぐすすぃ(Landroid/view/View;ILandroid/os/Bundle;)Z

    move-result p1

    return p1
.end method

.method public くし〴〺ぅ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->くし〴〺ぅ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_13

    .line 1
    :cond_e
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_13
    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    .line 1
    :cond_f
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->dispatchPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public づざかべべ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->づざかべべ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_13

    .line 1
    :cond_e
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onPopulateAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_13
    return-void
.end method

.method public なぎぱいぢぎ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
    .registers 5

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_f

    invoke-virtual {v0, p1, p2, p3}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->なぎぱいぢぎ(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1

    .line 1
    :cond_f
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2, p3}, Landroid/view/View$AccessibilityDelegate;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result p1

    return p1
.end method

.method public びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    invoke-virtual {v0}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->いいにぽつ()Z

    move-result v0

    if-nez v0, :cond_2b

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    if-eqz v0, :cond_2b

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->びぐびあび:Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻;->びぐびあび:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉねぞはがぞ(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_2b

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->びぐびあび(Landroid/view/View;Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;)V

    goto :goto_32

    .line 1
    :cond_2b
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    .line 2
    iget-object p2, p2, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/ぉ〲なぱぽた/〺つふすそ;->げつ〴ぬぐ:Landroid/view/accessibility/AccessibilityNodeInfo;

    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->onInitializeAccessibilityNodeInfo(Landroid/view/View;Landroid/view/accessibility/AccessibilityNodeInfo;)V

    :goto_32
    return-void
.end method

.method public ぺぁあねじ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .registers 4

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/〻ぞまぎな〻$げつ〴ぬぐ;->づざかべべ:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;

    if-eqz v0, :cond_e

    invoke-virtual {v0, p1, p2}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->ぺぁあねじ(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    goto :goto_13

    .line 1
    :cond_e
    iget-object v0, p0, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View$AccessibilityDelegate;

    invoke-virtual {v0, p1, p2}, Landroid/view/View$AccessibilityDelegate;->sendAccessibilityEventUnchecked(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    :goto_13
    return-void
.end method
