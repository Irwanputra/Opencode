.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;
.super Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;

.field public げつ〴ぬぐ:Z


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;

    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView$ぇぬぎばつ;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/recyclerview/widget/RecyclerView;II)V
    .registers 4

    if-nez p2, :cond_4

    if-eqz p3, :cond_7

    :cond_4
    const/4 p1, 0x1

    iput-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    :cond_7
    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;I)V
    .registers 3

    if-nez p2, :cond_e

    iget-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    if-eqz p1, :cond_e

    const/4 p1, 0x0

    iput-boolean p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->げつ〴ぬぐ:Z

    iget-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ$げつ〴ぬぐ;->〺つふすそ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;

    invoke-virtual {p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぇ〳〲〺すっ;->なぎぱいぢぎ()V

    :cond_e
    return-void
.end method
