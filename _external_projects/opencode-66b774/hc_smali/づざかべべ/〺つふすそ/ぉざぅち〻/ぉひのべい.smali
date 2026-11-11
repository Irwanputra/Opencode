.class public Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/げつ〴ぬぐ;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;)V
    .registers 9

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/げつ〴ぬぐ;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->げつ〴ぬぐ:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object v5, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->ぺぁあねじ:Ljava/lang/CharSequence;

    const/4 v2, 0x0

    const v3, 0x102002c

    const/4 v4, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/げつ〴ぬぐ;-><init>(Landroid/content/Context;IIILjava/lang/CharSequence;)V

    iput-object v6, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .registers 4

    iget-object p1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;->くし〴〺ぅ:Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;

    iget-object v0, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->てぜきぽく:Landroid/view/Window$Callback;

    if-eqz v0, :cond_10

    iget-boolean p1, p1, Lづざかべべ/〺つふすそ/ぉざぅち〻/せづっ〸ちね;->のぷのちつ:Z

    if-eqz p1, :cond_10

    const/4 p1, 0x0

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぉざぅち〻/ぉひのべい;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/げつ〴ぬぐ;

    invoke-interface {v0, p1, v1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_10
    return-void
.end method
