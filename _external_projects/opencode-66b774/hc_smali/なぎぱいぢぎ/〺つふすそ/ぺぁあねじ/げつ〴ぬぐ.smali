.class public final Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;

.field public final synthetic くし〴〺ぅ:J

.field public final synthetic づざかべべ:J

.field public final synthetic なぎぱいぢぎ:Z

.field public final synthetic びぐびあび:J


# direct methods
.method public constructor <init>(Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;JJJZ)V
    .registers 9

    iput-object p1, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;

    iput-wide p2, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:J

    iput-wide p4, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:J

    iput-wide p6, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:J

    iput-boolean p8, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    iget-object v0, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->〺つふすそ:Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;

    if-eqz v0, :cond_f

    iget-wide v1, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->くし〴〺ぅ:J

    iget-wide v3, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->びぐびあび:J

    iget-wide v5, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->づざかべべ:J

    iget-boolean v7, p0, Lなぎぱいぢぎ/〺つふすそ/ぺぁあねじ/げつ〴ぬぐ;->なぎぱいぢぎ:Z

    invoke-interface/range {v0 .. v7}, Lなぎぱいぢぎ/〺つふすそ/なぎぱいぢぎ/げつ〴ぬぐ;->げつ〴ぬぐ(JJJZ)V

    :cond_f
    return-void
.end method
