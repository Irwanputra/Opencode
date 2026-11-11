.class public Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;


# instance fields
.field public final synthetic げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(JJ)V
    .registers 7

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/げつ〴ぬぐ;->げつ〴ぬぐ:Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;

    .line 1
    iget-object v1, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->〻ぞまぎな〻:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;

    if-eqz v1, :cond_d

    .line 2
    iget-boolean v0, v0, Lなぎぱいぢぎ/〺つふすそ/〺つふすそ/びぐびあび;->ごづごきえ:Z

    if-nez v0, :cond_d

    .line 3
    invoke-interface {v1, p1, p2, p3, p4}, Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/びぐびあび;->げつ〴ぬぐ(JJ)V

    :cond_d
    return-void
.end method
