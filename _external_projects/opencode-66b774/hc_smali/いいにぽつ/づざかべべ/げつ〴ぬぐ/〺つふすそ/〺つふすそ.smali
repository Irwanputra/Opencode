.class public Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;
.super Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
.source ""


# instance fields
.field public ぁごぐすすぃ:Ljava/lang/StringBuilder;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .registers 2

    invoke-direct {p0, p1}, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;-><init>([Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    iput-object p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(ILjava/lang/String;)V
    .registers 3

    iget-object p1, p0, Lいいにぽつ/づざかべべ/げつ〴ぬぐ/〺つふすそ/〺つふすそ;->ぁごぐすすぃ:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0xa

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method
