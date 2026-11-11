.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 13

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$〺つふすそ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    .line 1
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->げつ〴ぬぐ()V

    iget-object v1, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->づざかべべ:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_38

    invoke-virtual {v1}, Landroid/view/View;->isLongClickable()Z

    move-result v2

    if-eqz v2, :cond_14

    goto :goto_38

    :cond_14
    invoke-virtual {v0}, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->くし〴〺ぅ()Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_38

    :cond_1b
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v2, v3}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-wide v4, v6

    invoke-static/range {v4 .. v11}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    invoke-virtual {v2}, Landroid/view/MotionEvent;->recycle()V

    iput-boolean v3, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->〳ぜぞぜべっ:Z

    :cond_38
    :goto_38
    return-void
.end method
