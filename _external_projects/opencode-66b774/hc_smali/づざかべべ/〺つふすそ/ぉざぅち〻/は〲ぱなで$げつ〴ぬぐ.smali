.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$げつ〴ぬぐ;
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
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 3

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;

    iget-object v0, v0, Lづざかべべ/〺つふすそ/ぉざぅち〻/は〲ぱなで;->づざかべべ:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-eqz v0, :cond_e

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    :cond_e
    return-void
.end method
