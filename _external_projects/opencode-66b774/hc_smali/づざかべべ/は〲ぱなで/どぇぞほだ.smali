.class public Lづざかべべ/は〲ぱなで/どぇぞほだ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;


# instance fields
.field public final げつ〴ぬぐ:Landroid/view/ViewGroupOverlay;


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getOverlay()Landroid/view/ViewGroupOverlay;

    move-result-object p1

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/どぇぞほだ;->げつ〴ぬぐ:Landroid/view/ViewGroupOverlay;

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/どぇぞほだ;->げつ〴ぬぐ:Landroid/view/ViewGroupOverlay;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->remove(Landroid/view/View;)V

    return-void
.end method

.method public げつ〴ぬぐ(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/どぇぞほだ;->げつ〴ぬぐ:Landroid/view/ViewGroupOverlay;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroupOverlay;->add(Landroid/view/View;)V

    return-void
.end method
