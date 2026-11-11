.class public Lづざかべべ/は〲ぱなで/でどあくず;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static 〺つふすそ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Ljava/lang/ref/WeakReference<",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition;",
            ">;>;>;>;"
        }
    .end annotation
.end field

.field public static くし〴〺ぅ:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroid/view/ViewGroup;",
            ">;"
        }
    .end annotation
.end field

.field public static げつ〴ぬぐ:Landroidx/transition/Transition;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroidx/transition/AutoTransition;

    invoke-direct {v0}, Landroidx/transition/AutoTransition;-><init>()V

    sput-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->げつ〴ぬぐ:Landroidx/transition/Transition;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->くし〴〺ぅ:Ljava/util/ArrayList;

    return-void
.end method

.method public static 〺つふすそ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "L\u3065\u3056\u304b\u3079\u3079/\u3065\u3056\u304b\u3079\u3079/\u3052\u3064\u3034\u306c\u3050<",
            "Landroid/view/ViewGroup;",
            "Ljava/util/ArrayList<",
            "Landroidx/transition/Transition;",
            ">;>;"
        }
    .end annotation

    sget-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_13

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    if-eqz v0, :cond_13

    return-object v0

    :cond_13
    new-instance v0, Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {v0}, Lづざかべべ/づざかべべ/げつ〴ぬぐ;-><init>()V

    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-direct {v1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sget-object v2, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ:Ljava/lang/ThreadLocal;

    invoke-virtual {v2, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static げつ〴ぬぐ(Landroid/view/ViewGroup;Landroidx/transition/Transition;)V
    .registers 5

    sget-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_68

    invoke-static {p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->ぶでにく〼〳(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_68

    sget-object v0, Lづざかべべ/は〲ぱなで/でどあくず;->くし〴〺ぅ:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_17

    sget-object p1, Lづざかべべ/は〲ぱなで/でどあくず;->げつ〴ぬぐ:Landroidx/transition/Transition;

    :cond_17
    invoke-virtual {p1}, Landroidx/transition/Transition;->いいにぽつ()Landroidx/transition/Transition;

    move-result-object p1

    .line 1
    invoke-static {}, Lづざかべべ/は〲ぱなで/でどあくず;->〺つふすそ()Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, p0, v1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 3
    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_42

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_42

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_32
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_42

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/transition/Transition;

    invoke-virtual {v2, p0}, Landroidx/transition/Transition;->でどあくず(Landroid/view/View;)V

    goto :goto_32

    :cond_42
    if-eqz p1, :cond_48

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Landroidx/transition/Transition;->〳ぜぞぜべっ(Landroid/view/ViewGroup;Z)V

    .line 4
    :cond_48
    sget v0, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->transition_current_scene:I

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lづざかべべ/は〲ぱなで/ぇぬぎばつ;

    if-nez v2, :cond_67

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewGroup;->setTag(ILjava/lang/Object;)V

    if-eqz p1, :cond_68

    .line 6
    new-instance v0, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;

    invoke-direct {v0, p1, p0}, Lづざかべべ/は〲ぱなで/でどあくず$げつ〴ぬぐ;-><init>(Landroidx/transition/Transition;Landroid/view/ViewGroup;)V

    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    goto :goto_68

    .line 7
    :cond_67
    throw v1

    :cond_68
    :goto_68
    return-void
.end method
