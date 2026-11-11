.class public Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnPreDrawListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/は〲ぱなで/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;


# direct methods
.method public constructor <init>(Lづざかべべ/は〲ぱなで/いいにぽつ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreDraw()Z
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->どぇぞほだ(Landroid/view/View;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;

    iget-object v1, v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ:Landroid/view/ViewGroup;

    if-eqz v1, :cond_20

    iget-object v0, v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    if-eqz v0, :cond_20

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;

    iget-object v0, v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->どぇぞほだ(Landroid/view/View;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/いいにぽつ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/は〲ぱなで/いいにぽつ;

    const/4 v1, 0x0

    iput-object v1, v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->〺つふすそ:Landroid/view/ViewGroup;

    iput-object v1, v0, Lづざかべべ/は〲ぱなで/いいにぽつ;->くし〴〺ぅ:Landroid/view/View;

    :cond_20
    const/4 v0, 0x1

    return v0
.end method
