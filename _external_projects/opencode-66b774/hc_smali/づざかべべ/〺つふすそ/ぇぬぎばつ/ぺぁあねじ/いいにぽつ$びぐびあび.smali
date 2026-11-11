.class public Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/MenuItem$OnActionExpandListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3073\u3050\u3073\u3042\u3073"
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

.field public final げつ〴ぬぐ:Landroid/view/MenuItem$OnActionExpandListener;


# direct methods
.method public constructor <init>(Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;Landroid/view/MenuItem$OnActionExpandListener;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->げつ〴ぬぐ:Landroid/view/MenuItem$OnActionExpandListener;

    return-void
.end method


# virtual methods
.method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->げつ〴ぬぐ:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    invoke-virtual {v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
    .registers 4

    iget-object v0, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->げつ〴ぬぐ:Landroid/view/MenuItem$OnActionExpandListener;

    iget-object v1, p0, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ$びぐびあび;->〺つふすそ:Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/いいにぽつ;

    invoke-virtual {v1, p1}, Lづざかべべ/〺つふすそ/ぇぬぎばつ/ぺぁあねじ/くし〴〺ぅ;->くし〴〺ぅ(Landroid/view/MenuItem;)Landroid/view/MenuItem;

    move-result-object p1

    invoke-interface {v0, p1}, Landroid/view/MenuItem$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method
